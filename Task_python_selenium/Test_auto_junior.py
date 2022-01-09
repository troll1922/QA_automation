import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
import time


class EcwidTest(unittest.TestCase):

    def test_price_filter(self):
        """Проверка фильтра цены"""
        driver = webdriver.Chrome(executable_path='c:\\webdrivers\\chromedriver.exe')
        driver.maximize_window()
        driver.implicitly_wait(10)
        driver.get("https://buy-in-10-seconds.company.site/search")
        # задаем  min/max значения цены для товаров
        min_price = 1
        max_price = 4
        # находим поля ввода и вводим значения
        input_min = driver.find_element(By.CSS_SELECTOR, ".ec-filter__price-from input[type=number]")
        input_min.send_keys(min_price)
        input_max = driver.find_element(By.CSS_SELECTOR, ".ec-filter__price-to input[type=number]")
        input_max.send_keys(max_price)
        input_min.send_keys(Keys.ENTER)
        # получаем список всех товаров на странице согласно заданному фильтру по цене
        page_products = driver.find_elements(By.CSS_SELECTOR, ".grid-product__price-value.ec-price-item")
        price_filter = False          # фильтр по которому будем определять правильность работы, д.б. True
        if len(page_products) > 1:    # проверяем условие, при котором товаров на странице больше одного
            # цена первого товара
            price_first_product = float(page_products[0].text.replace('$', ''))
            # цена последнего товара
            price_last_product = float(page_products[-1].text.replace('$', ''))
            # проверяем соблюдается ли условие по фильтру
            if (price_first_product >= min_price) & (price_last_product <= max_price):
                price_filter = True
            else:
                price_filter = False
        if len(page_products) == 1:  # проверяем условие, при одном товаре на странице
            # цена первого товара
            price_first_product = float(page_products[0].text.replace('$', ''))
            # проверяем соблюдается ли условие по фильтру
            if (price_first_product >= min_price) & (price_first_product <= max_price):
                price_filter = True
            else:
                price_filter = False
        if len(page_products) == 0:  # при отсутствии товаров на странице
            price_filter = False
        self.assertEqual(True, price_filter)  # товары на странице должны быть в дипазоне цен по фильтру
        driver.close()

    def test_status_available(self):
        """Проверка фильтра распродано"""
        driver = webdriver.Chrome(executable_path='c:\\webdrivers\\chromedriver.exe')
        driver.maximize_window()
        driver.implicitly_wait(10)
        driver.get("https://buy-in-10-seconds.company.site/search")
        # проверка фильтра статуса товара
        in_stock = driver.find_element(By.ID, "checkbox-in_stock")
        time.sleep(1)
        in_stock.click()
        time.sleep(2)
        # проверяем есть ли на странице слово Распродано
        if "Распродано" in driver.page_source:
            item_sale = False
        else:
            item_sale = True
        self.assertEqual(True, item_sale)  # на странице не должен отображаться распроданный товар
        driver.close()


if __name__ == '__main__':
    unittest.main()
