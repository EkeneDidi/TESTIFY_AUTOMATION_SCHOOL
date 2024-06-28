
# Create a test case that compares two strings
# Create another test case that compares different numbers
# Use any unit testing framework from this week's lessons.

import unittest


class TestComparisons(unittest.TestCase):
    def test_string_comparison(self):
        string1 = "Blazing"
        string2 = "Blazing"
        self.assertEqual(string1, string2, "Strings should be equal")

    def test_number_comparison(self):
        number1 = 10
        number2 = 25
        self.assertNotEqual(number1, number2, "Numbers should not be equal")


if __name__ == '__main__':
    unittest.main()