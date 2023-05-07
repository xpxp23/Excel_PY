
import openpyxl

# 加载现有的Excel文件

workbook = openpyxl.load_workbook('example.xlsx')

# 获取活动的工作表对象

sheet = workbook.active

# 获取指定单元格的数据

cell_value = sheet['A1'].value

print(cell_value)  # 输出 "Hello"

# 遍历所有单元格并打印数据

for row in sheet.iter_rows():

    for cell in row:
        print(cell.value)

# 关闭工作簿和文件对象

workbook.close()

