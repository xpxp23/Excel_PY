
import openpyxl

# 创建一个新的工作簿对象

workbook = openpyxl.Workbook()

# 获取活动的工作表对象

sheet = workbook.active

# 在A1单元格中插入数据

sheet['A1'] = 'Hello'

sheet['B1'] = 'World!'

# 保存工作簿到文件

workbook.save('example.xlsx')

