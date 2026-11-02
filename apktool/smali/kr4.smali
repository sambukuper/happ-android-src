.class public final synthetic Lkr4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 21
    iput-byte p7, p0, Lkr4;->X:B

    iput-object p1, p0, Lkr4;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lkr4;->f0:Ljava/lang/Object;

    iput-object p3, p0, Lkr4;->g0:Ljava/lang/Object;

    iput-object p4, p0, Lkr4;->h0:Ljava/lang/Object;

    iput-object p5, p0, Lkr4;->i0:Ljava/lang/Object;

    iput p6, p0, Lkr4;->Y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkr7;Ldn2;Ltn2;Lrn2;Lo87;I)V
    .locals 1

    .line 20
    const/4 v0, 0x3

    iput-byte v0, p0, Lkr4;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkr4;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lkr4;->f0:Ljava/lang/Object;

    iput-object p3, p0, Lkr4;->g0:Ljava/lang/Object;

    iput-object p4, p0, Lkr4;->h0:Ljava/lang/Object;

    iput-object p5, p0, Lkr4;->i0:Ljava/lang/Object;

    iput p6, p0, Lkr4;->Y:I

    return-void
.end method

.method public synthetic constructor <init>(Lkx4;Lwb7;Lxz4;Lzy0;Lsn2;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lkr4;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkr4;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lkr4;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lkr4;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lkr4;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lkr4;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    iput p6, p0, Lkr4;->Y:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lkr4;->X:B

    .line 4
    .line 5
    iget-object v2, v0, Lkr4;->h0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, Lkr4;->g0:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v4, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    iget v5, v0, Lkr4;->Y:I

    .line 12
    .line 13
    iget-object v6, v0, Lkr4;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, Lkr4;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v8, v0, Lkr4;->Z:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v9, v8

    .line 23
    check-cast v9, Lce8;

    .line 24
    .line 25
    move-object v10, v7

    .line 26
    check-cast v10, Lyd8;

    .line 27
    .line 28
    move-object v13, v6

    .line 29
    check-cast v13, Lta2;

    .line 30
    .line 31
    move-object/from16 v14, p1

    .line 32
    .line 33
    check-cast v14, Llp2;

    .line 34
    .line 35
    move-object/from16 v1, p2

    .line 36
    .line 37
    check-cast v1, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    or-int/lit8 v1, v5, 0x1

    .line 43
    .line 44
    invoke-static {v1}, Lw79;->P(I)I

    .line 45
    .line 46
    .line 47
    move-result v15

    .line 48
    iget-object v11, v0, Lkr4;->g0:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v12, v0, Lkr4;->h0:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static/range {v9 .. v15}, Lrq7;->e(Lce8;Lyd8;Ljava/lang/Object;Ljava/lang/Object;Lta2;Llp2;I)V

    .line 53
    .line 54
    .line 55
    return-object v4

    .line 56
    :pswitch_0
    move-object/from16 v16, v8

    .line 57
    .line 58
    check-cast v16, Lkr7;

    .line 59
    .line 60
    move-object/from16 v17, v7

    .line 61
    .line 62
    check-cast v17, Ldn2;

    .line 63
    .line 64
    move-object/from16 v18, v3

    .line 65
    .line 66
    check-cast v18, Ltn2;

    .line 67
    .line 68
    move-object/from16 v19, v2

    .line 69
    .line 70
    check-cast v19, Lrn2;

    .line 71
    .line 72
    move-object/from16 v20, v6

    .line 73
    .line 74
    check-cast v20, Lo87;

    .line 75
    .line 76
    move-object/from16 v21, p1

    .line 77
    .line 78
    check-cast v21, Llp2;

    .line 79
    .line 80
    move-object/from16 v0, p2

    .line 81
    .line 82
    check-cast v0, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    or-int/lit8 v0, v5, 0x1

    .line 88
    .line 89
    invoke-static {v0}, Lw79;->P(I)I

    .line 90
    .line 91
    .line 92
    move-result v22

    .line 93
    invoke-static/range {v16 .. v22}, Lrq7;->a(Lkr7;Ldn2;Ltn2;Lrn2;Lo87;Llp2;I)V

    .line 94
    .line 95
    .line 96
    return-object v4

    .line 97
    :pswitch_1
    check-cast v8, Lkx4;

    .line 98
    .line 99
    check-cast v7, Lwb7;

    .line 100
    .line 101
    check-cast v3, Lxz4;

    .line 102
    .line 103
    check-cast v6, Lzy0;

    .line 104
    .line 105
    move-object v9, v2

    .line 106
    check-cast v9, Lsn2;

    .line 107
    .line 108
    move-object/from16 v10, p1

    .line 109
    .line 110
    check-cast v10, Llp2;

    .line 111
    .line 112
    move-object/from16 v0, p2

    .line 113
    .line 114
    check-cast v0, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    or-int/lit8 v0, v5, 0x1

    .line 120
    .line 121
    invoke-static {v0}, Lw79;->P(I)I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    move-object v5, v8

    .line 126
    move-object v8, v6

    .line 127
    move-object v6, v7

    .line 128
    move-object v7, v3

    .line 129
    invoke-static/range {v5 .. v11}, Lvb7;->c(Lkx4;Lwb7;Lxz4;Lzy0;Lsn2;Llp2;I)V

    .line 130
    .line 131
    .line 132
    return-object v4

    .line 133
    :pswitch_2
    move-object v12, v8

    .line 134
    check-cast v12, Lcm5;

    .line 135
    .line 136
    move-object v13, v7

    .line 137
    check-cast v13, Ljava/lang/String;

    .line 138
    .line 139
    move-object v14, v3

    .line 140
    check-cast v14, Ljava/lang/String;

    .line 141
    .line 142
    move-object v15, v2

    .line 143
    check-cast v15, Lgn2;

    .line 144
    .line 145
    move-object/from16 v16, v6

    .line 146
    .line 147
    check-cast v16, Lkx4;

    .line 148
    .line 149
    move-object/from16 v17, p1

    .line 150
    .line 151
    check-cast v17, Llp2;

    .line 152
    .line 153
    move-object/from16 v0, p2

    .line 154
    .line 155
    check-cast v0, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    or-int/lit8 v0, v5, 0x1

    .line 161
    .line 162
    invoke-static {v0}, Lw79;->P(I)I

    .line 163
    .line 164
    .line 165
    move-result v18

    .line 166
    invoke-static/range {v12 .. v18}, Lz91;->i(Lcm5;Ljava/lang/String;Ljava/lang/String;Lgn2;Lkx4;Llp2;I)V

    .line 167
    .line 168
    .line 169
    return-object v4

    .line 170
    :pswitch_3
    check-cast v8, Liw0;

    .line 171
    .line 172
    check-cast v7, Lky4;

    .line 173
    .line 174
    check-cast v3, Lp77;

    .line 175
    .line 176
    check-cast v2, Lwj8;

    .line 177
    .line 178
    move-object v9, v6

    .line 179
    check-cast v9, Lzy0;

    .line 180
    .line 181
    move-object/from16 v10, p1

    .line 182
    .line 183
    check-cast v10, Llp2;

    .line 184
    .line 185
    move-object/from16 v0, p2

    .line 186
    .line 187
    check-cast v0, Ljava/lang/Integer;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    or-int/lit8 v0, v5, 0x1

    .line 193
    .line 194
    invoke-static {v0}, Lw79;->P(I)I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    move-object v6, v7

    .line 199
    move-object v5, v8

    .line 200
    move-object v8, v2

    .line 201
    move-object v7, v3

    .line 202
    invoke-static/range {v5 .. v11}, Llr4;->a(Liw0;Lky4;Lp77;Lwj8;Lzy0;Llp2;I)V

    .line 203
    .line 204
    .line 205
    return-object v4

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
