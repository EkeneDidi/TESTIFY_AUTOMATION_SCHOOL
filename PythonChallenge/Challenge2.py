# Create a length converter function.
# Converts from centimeters to meter.
def length_converter(length_in_cm):
    length_in_meters = length_in_cm/100
    return length_in_meters


print(length_converter(50))