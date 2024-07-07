import time
from appium import webdriver
from appium.options.common import AppiumOptions
from appium.webdriver.common.appiumby import AppiumBy


def main():
    desired_caps = {
        "deviceName": "Didi60",
        "automationName": "uiAutomator2",
        "platformName": "Android",
        "platformVersion": "14",
        "app": "/Users/reliancehmo/Downloads/Android-MyDemoAppRN.1.1.0.build-226.apk",
        "appPackage": "com.saucelabs.mydemoapp.rn",
        "appActivity": "com.saucelabs.mydemoapp.rn.MainActivity",
        "noSign": True
    }
    driver = webdriver.Remote("http://127.0.0.1:4723/wd/hub", options=AppiumOptions().load_capabilities(caps=desired_caps))
    menu_button = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="open menu"]')
    menu_button.click()
    time.sleep(5)
    login_button = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="menu item log in"]')
    login_button.click()
    time.sleep(5)

    #NEGATIVE TEST 1
    username = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Username input field"]')
    username.send_keys("dididemo")
    time.sleep(5)
    password = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Password input field"]')
    password.send_keys("wrongP")
    time.sleep(5)
    login = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="Login button"]')
    login.click()
    time.sleep(5)

    #NEGATIVE TEST 2
    username.clear()
    time.sleep(5)
    login = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="Login button"]')
    login.click()
    time.sleep(5)

    #LOGIN WITH VALID USERNAME AND PASSWORD
    username = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Username input field"]')
    username.send_keys("bob@example.com")
    time.sleep(5)
    password.clear()
    password = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Password input field"]')
    password.send_keys("10203040")
    time.sleep(5)
    login = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="Login button"]')
    login.click()
    time.sleep(5)

    # Assert you are on the Product Page
    product = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="Products"]')
    expect_result = product.text
    actual_result = "Products"
    if actual_result == expect_result:
        print("This is the Product page")
    time.sleep(5)

    # Sort page by"Price-Ascending
    sort_page = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="sort button"]')
    sort_page.click()
    time.sleep(5)
    priceAscending = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="Price - Ascending"]')
    priceAscending.click()
    time.sleep(5)

    #Add all items on the Products page to cart.
    item1 = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@content-desc="store item text" and @text="Sauce Labs Onesie"]')
    item1.click()
    time.sleep(5)
    item1addToCart = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="Add To Cart button"]')
    item1addToCart.click()
    driver.back()
    time.sleep(5)
    item2 = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@content-desc="store item text" and @text="Sauce Labs Bike Light"]')
    item2.click()
    time.sleep(5)
    item2addToCart = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="Add To Cart"]')
    item2addToCart.click()
    time.sleep(5)
    driver.back()
    item3 = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@content-desc="store item text" and @text="Sauce Labs Bolt T-Shirt"]')
    item3.click()
    time.sleep(5)
    item3addToCart = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="Add To Cart"]')
    item3addToCart.click()
    time.sleep(5)
    driver.back()
    item4 = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@content-desc="store item text" and @text="Test.allTheThings() T-Shirt"]')
    item4.click()
    time.sleep(5)
    item4addToCart = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="Add To Cart"]')
    item4addToCart.click()
    time.sleep(5)
    driver.back()
    time.sleep(5)
    item5 = driver.find_element(by=AppiumBy.XPATH, value='(//android.view.ViewGroup[@content-desc="store item"])[5]/android.view.ViewGroup/android.widget.ImageView')
    item5.click()
    time.sleep(5)
    item5addToCart = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="Add To Cart"]')
    item5addToCart.click()
    time.sleep(5)
    driver.back()
    time.sleep(5)
    item6 = driver.find_element(by=AppiumBy.XPATH, value='(//android.view.ViewGroup[@content-desc="store item"])[6]/android.view.ViewGroup/android.widget.ImageView')
    item6.click()
    time.sleep(5)
    item6star = driver.find_element(by=AppiumBy.XPATH, value='(//android.widget.TextView[@text="󰓏"])[5]')
    item6star.click()
    time.sleep(5)
    item6modal = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="Close Modal"]')
    item6modal.click()
    time.sleep(5)
    item6addToCart = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="Add To Cart"]')
    item6addToCart.click()
    time.sleep(5)
    driver.back()
    time.sleep(5)

    #Click on My Cart Icon
    cartIcon = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="cart badge"]/android.widget.ImageView')
    cartIcon.click()
    time.sleep(5)

    # Assert that  the items you added to cart are displayed correctly on the "MyCart"page.
    MyCartPage = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="My Cart"]')
    expect_result = "MyCartPage"
    actual_result = "MyCartPage"
    if actual_result == expect_result:
        print("My Cart page is complete")
    time.sleep(5)

    #Remove any 2 items from the cart
    removeItem1 = driver.find_element(by=AppiumBy.XPATH, value='(//android.widget.TextView[@text="Remove Item"])[1]')
    removeItem1.click()
    time.sleep(5)
    removeItem2 = driver.find_element(by=AppiumBy.XPATH, value='(//android.widget.TextView[@text="Remove Item"])[2]')
    removeItem2.click()
    time.sleep(5)

    #Assert the number of items remaining in your cart
    noOfItems = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="4"]')
    expect_result = 4
    actual_result = 4
    if actual_result == expect_result:
        print("Items in my cart is 4")
    time.sleep(5)

    #Click on the "Proceed to checkout" button.
    checkout = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="Proceed To Checkout button"]')
    checkout.click()
    time.sleep(5)

    #Input your shipping details on the Checkout page.
    fullName = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Full Name* input field"]')
    fullName.send_keys("Didi Nworah")
    address1 = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Address Line 1* input field"]')
    address1.send_keys("2 Ikoyi Road")
    address2 = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Address Line 2 input field"]')
    address2.send_keys("2 Osborne Road")
    city = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="City* input field"]')
    city.send_keys("Ikeja")
    state = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="State/Region input field"]')
    state.send_keys("Lagos")
    zipcode = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Zip Code* input field"]')
    zipcode.send_keys(23464)
    country = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Country* input field"]')
    country.send_keys("Nigeria")
    time.sleep(5)
    payment = driver.find_element(by=AppiumBy.ACCESSIBILITY_ID, value='To Payment button')
    payment.click()
    time.sleep(5)

    #Assert that you are on the payment page
    paymentPage = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="Enter a payment method"]')
    expect_result = paymentPage.text
    actual_result = paymentPage
    if actual_result == expect_result:
        print("I am on the payment page")
    time.sleep(5)

    #Input your payment Information
    fullName1 = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Full Name* input field"]')
    fullName1.send_keys("Didi Mandy")
    cardNumber = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Card Number* input field"]')
    cardNumber.send_keys(325812657568789)
    expirationDate = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Expiration Date* input field"]')
    expirationDate.send_keys("09/28")
    securitycode = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.EditText[@content-desc="Security Code* input field"]')
    securitycode.send_keys(567)
    #Proceed to Review your order
    reviewOrderButton = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="Review Order button"]')
    reviewOrderButton.click()
    time.sleep(5)

    #Click on the "Place order" button.
    placeorderButton = driver.find_element(by=AppiumBy.XPATH, value='//android.view.ViewGroup[@content-desc="Place Order button"]')
    placeorderButton.click()
    time.sleep(5)

    #Assert that user sees a success message "thank you for your order".
    orderIsComplete = driver.find_element(by=AppiumBy.XPATH, value='//android.widget.TextView[@text="Thank you for your order"]"]')
    expect_result = "Thank you for your order"
    actual_result = "Thank you for your order"
    if actual_result == expect_result:
        print("Thank you for your order")
    time.sleep(5)


    driver.quit()


if __name__ == '__main__':
    main()
