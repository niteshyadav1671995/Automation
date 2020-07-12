# -*- coding: utf-8 -*-
import unittest
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait

import InputDataUtils

class LoginTest(unittest.TestCase):
    driver = ""
    @classmethod
    def setUpClass(cls):
        global driver
        driver = webdriver.Chrome()
    def test_01_HomePage(self):
        driver.get("https://www.amazon.in")
        self.assertEqual("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",driver.title)
    def test_02_LoginPage(self):
        actions = ActionChains(driver)
        actions.move_to_element(driver.find_element_by_id("nav-link-accountList"))
        actions.move_to_element(driver.find_element_by_xpath("//*[text()='Sign In']")).click().perform()
        self.assertEqual("Amazon Sign In",driver.title)
    def test_03_UserDashBoard(self):
        WebDriverWait(driver, 10).until(EC.element_to_be_clickable((By.ID,"ap_email"))).send_keys(InputDataUtils.getUserName())
        driver.find_element_by_id("continue").click()
        WebDriverWait(driver, 10).until(EC.visibility_of_element_located((By.ID,"ap_password"))).send_keys(InputDataUtils.getPassword())
        driver.find_element_by_id("signInSubmit").click()
        print(driver.title)
if __name__ == "__main__":
    unittest.main()