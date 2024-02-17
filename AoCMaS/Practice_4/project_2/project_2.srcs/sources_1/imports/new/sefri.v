`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 23.11.2023 16:44:54
// Design Name: 
// Module Name: sefri
// Project Name: 
// Target Devices: 
// Tool Versions: 
// Description: 
// 
// Dependencies: 
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
//////////////////////////////////////////////////////////////////////////////////
`timescale 1ns / 1ps

module sefri #(width = 2)(
    input [2 ** (width) - 1 : 0] a, // ������� ����� ������� �����
    output reg [width - 1 : 0] Y, // ������ ����� ����� ����� � �������� ������, ������
    output Q // ������ ����� �����
    );
    
integer i;

always @(a)
begin
    Y = 0;
    for(i = 0; i <= 2 ** (width) - 1; i = i + 1)
        if(a[i])
        begin
            Y = i;
        end
end
// ����� ��� �����. ��������� ������� ��������, ���� ���� �� ��� ������, ��
// ������������� ������� f � �������� i. ������ ���������� �����: 1,2,3,4,5 � �.�.
// �� � �������� �������. ����� ���������� - f ���������� �������� ����� ����� �����
assign Q = a == 0; // �� � ����� ������ ������������� ����� ����� ����

endmodule
