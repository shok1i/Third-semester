`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 23.11.2023 16:36:18
// Design Name: 
// Module Name: deshi
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

module deshi #(width = 2)(
    input Active, // ����������� ����
    input [width - 1 : 0] a, // ���� ��� ����� �������
    output [2**(width) - 1: 0] f // �������� �������
    );
    
reg [2**(width) - 1 : 0] r;

always @*
begin
    if(!Active)
        r = 0;
    else 
        r = 1 << a;
end
// ����� ������� ����� �� ���������� � ������� ��������, ������� ���������� �� ������. ��� ����� ��������� ���
// 000000010 ��� 0001000000, ������ 1 ����� ������ ����
assign f = r; // �������� ������� �� ����� � �.�. ��� ������ ������� ������� ���������
endmodule
