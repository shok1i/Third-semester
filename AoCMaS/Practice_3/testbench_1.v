`timescale 1ns / 1ps

module testbench();

reg [5:0] args;
reg clk;           
wire res1, res2;                 
reg [0:31] reference_reg, error_reg1, error_reg2;  

initial
begin
    reference_reg = 32'h52263ECD;  // »нициализаци€ эталонного регистра
    args = 5'b00000;             
    clk = 0;                  
    error_reg1 = 0;             
    error_reg2 = 0;             
end

always #10 clk = ~clk;

always @(posedge clk)
begin
    error_reg1[args] = res1 ~^ reference_reg[args];  
    error_reg2[args] = res2 ~^ reference_reg[args];
    args = args + 1;                            
    if(args == 6'd33)
        $finish;                                   // «авершение симул€ции после обработки всех аргументов
end      
sdnf mod1 (.in(args[4:0]), .f(res1));          
mdnf mod2 (.in(args[4:0]), .f(res2));  
endmodule