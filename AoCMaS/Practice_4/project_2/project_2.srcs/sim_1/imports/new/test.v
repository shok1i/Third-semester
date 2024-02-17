`timescale 1ns / 1ps

module test();
reg [5:0] args;
reg clk;
wire res;
reg [0:31] ref_reg, error_reg;

initial
begin
    ref_reg = 32'h46D692F3;
    args = 5'b00000;
    clk = 0;
    error_reg = 0;
end

always #10 clk = ~clk;

always @(posedge clk)
begin
    error_reg[args] = res ~^ ref_reg[args];
    args = args + 1;
    if(args == 6'd33)
        $finish;
end

// TASK 1
 funMulti mux(.a(args[4]), .b(args[3]),.c (args[2]),.d(args[1]), .e(args[0]), .f(res));

// TASK 2
//funDeshi mux(.a(args[4]), .b(args[3]),.c (args[2]),.d(args[1]), .e(args[0]), .f(res));


// TASK 3
// funSefri mux(.a(args[4]), .b(args[3]),.c (args[2]),.d(args[1]), .e(args[0]), .f(res));

endmodule
