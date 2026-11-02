.class public final Lx51;
.super Ljava/lang/Object;

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;

.field public final Z:Ljava/lang/Object;

.field public final f0:Ljava/lang/Object;

.field public final g0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lx51;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lx51;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lx51;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lx51;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lx51;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lx51;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lx51;->g0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lx51;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lx51;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lx51;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Llp2;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    and-int/lit8 v0, p2, 0x3

    .line 25
    .line 26
    const/4 v6, 0x2

    .line 27
    if-eq v0, v6, :cond_0

    .line 28
    .line 29
    move v0, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v5

    .line 32
    :goto_0
    and-int/2addr p2, v4

    .line 33
    invoke-virtual {p1, p2, v0}, Llp2;->N(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_4

    .line 38
    .line 39
    sget-object p2, Lhx4;->X:Lhx4;

    .line 40
    .line 41
    const-string v0, "Container"

    .line 42
    .line 43
    invoke-static {p2, v0}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    new-instance v6, Li58;

    .line 48
    .line 49
    move-object v7, p0

    .line 50
    check-cast v7, Ly05;

    .line 51
    .line 52
    const-string v10, "getValue()Ljava/lang/Object;"

    .line 53
    .line 54
    const/4 v11, 0x0

    .line 55
    const-class v8, Ly05;

    .line 56
    .line 57
    const-string v9, "value"

    .line 58
    .line 59
    invoke-direct/range {v6 .. v11}, Lnx5;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    check-cast v3, Lq58;

    .line 63
    .line 64
    invoke-static {v3}, Lpn7;->i(Lq58;)Lp8;

    .line 65
    .line 66
    .line 67
    sget-object p0, Lpz2;->q0:Ln50;

    .line 68
    .line 69
    check-cast v2, Lgg5;

    .line 70
    .line 71
    new-instance v0, Lsn;

    .line 72
    .line 73
    const/16 v3, 0x12

    .line 74
    .line 75
    invoke-direct {v0, v6, v2, p0, v3}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p2, v0}, Lw79;->t(Lkx4;Lgn2;)Lkx4;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast v1, Lzy0;

    .line 83
    .line 84
    sget-object p2, Lpz2;->Z:Lp50;

    .line 85
    .line 86
    invoke-static {p2, v4}, Lg80;->c(Lp50;Z)Lxr4;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-static {p1}, Lkm4;->I(Llp2;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p1}, Llp2;->l()Lkl5;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {p1, p0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    sget-object v3, Luz0;->j:Lpz2;

    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Llp2;->Z()V

    .line 108
    .line 109
    .line 110
    iget-boolean v3, p1, Llp2;->S:Z

    .line 111
    .line 112
    if-eqz v3, :cond_1

    .line 113
    .line 114
    invoke-virtual {p1}, Llp2;->k()V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    invoke-virtual {p1}, Llp2;->j0()V

    .line 119
    .line 120
    .line 121
    :goto_1
    sget-object v3, Lpz2;->B0:Ldx0;

    .line 122
    .line 123
    invoke-static {v3, p1, p2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    sget-object p2, Lpz2;->A0:Ldx0;

    .line 127
    .line 128
    invoke-static {p2, p1, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object p2, Lpz2;->C0:Ldx0;

    .line 132
    .line 133
    iget-boolean v2, p1, Llp2;->S:Z

    .line 134
    .line 135
    if-nez v2, :cond_2

    .line 136
    .line 137
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-static {v2, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-nez v2, :cond_3

    .line 150
    .line 151
    :cond_2
    invoke-static {v0, p1, v0, p2}, Lp61;->v(ILlp2;ILdx0;)V

    .line 152
    .line 153
    .line 154
    :cond_3
    sget-object p2, Lpz2;->z0:Ldx0;

    .line 155
    .line 156
    invoke-static {p2, p1, p0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-virtual {v1, p1, p0}, Lzy0;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v4}, Llp2;->p(Z)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_4
    invoke-virtual {p1}, Llp2;->Q()V

    .line 171
    .line 172
    .line 173
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_0
    check-cast p0, Ljava/lang/ClassLoader;

    .line 177
    .line 178
    check-cast v3, Lli8;

    .line 179
    .line 180
    check-cast v2, Ldn2;

    .line 181
    .line 182
    check-cast v1, Lea6;

    .line 183
    .line 184
    check-cast p1, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    check-cast p2, Lpz3;

    .line 191
    .line 192
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    sget-object v0, Lpz3;->c:Lpz3;

    .line 196
    .line 197
    invoke-virtual {p2, v0}, Lpz3;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_5

    .line 202
    .line 203
    sget-object p0, Luw3;->c:Luw3;

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_5
    iget-object v0, p2, Lpz3;->b:Lmz3;

    .line 207
    .line 208
    const/4 v6, 0x0

    .line 209
    if-eqz v0, :cond_7

    .line 210
    .line 211
    if-nez v2, :cond_6

    .line 212
    .line 213
    move-object v1, v6

    .line 214
    goto :goto_3

    .line 215
    :cond_6
    new-instance v2, Lf3;

    .line 216
    .line 217
    const/4 v7, 0x7

    .line 218
    invoke-direct {v2, v1, v7}, Lf3;-><init>(Ljava/lang/Object;B)V

    .line 219
    .line 220
    .line 221
    new-instance v1, Ly51;

    .line 222
    .line 223
    invoke-direct {v1, v2, p1, v5}, Ly51;-><init>(Ljava/lang/Object;IB)V

    .line 224
    .line 225
    .line 226
    :goto_3
    invoke-static {v0, p0, v3, v4, v1}, Lys0;->Z(Lmz3;Ljava/lang/ClassLoader;Lli8;ZLdn2;)Lu1;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    goto :goto_4

    .line 231
    :cond_7
    move-object p0, v6

    .line 232
    :goto_4
    new-instance p1, Luw3;

    .line 233
    .line 234
    iget-object p2, p2, Lpz3;->a:Lrz3;

    .line 235
    .line 236
    if-eqz p2, :cond_8

    .line 237
    .line 238
    invoke-static {p2}, Lys0;->b0(Lrz3;)Lyw3;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    :cond_8
    invoke-direct {p1, p0, v6}, Luw3;-><init>(Lpw3;Lyw3;)V

    .line 243
    .line 244
    .line 245
    move-object p0, p1

    .line 246
    :goto_5
    return-object p0

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
