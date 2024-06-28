# Sort an array of numbers in descending order

scores = [1, 9, 78, 50, 11, 8, 10, 76]


def arrange_scores(array):
    array.sort(reverse=True)
    return array


print(arrange_scores(scores))