.class public final synthetic Ld67;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-byte p1, p0, Ld67;->X:B

    .line 2
    .line 3
    iput-object p3, p0, Ld67;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p4, p0, Ld67;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 11
    iput-byte p3, p0, Ld67;->X:B

    iput-object p1, p0, Ld67;->Y:Ljava/lang/Object;

    iput-object p2, p0, Ld67;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Ld67;->X:B

    .line 2
    .line 3
    const/16 v1, 0x39

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sget-object v3, Ldn8;->a:Ldn8;

    .line 7
    .line 8
    iget-object v4, p0, Ld67;->Z:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Ld67;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lzo8;

    .line 16
    .line 17
    check-cast v4, Lkx4;

    .line 18
    .line 19
    check-cast p1, Llp2;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lw79;->P(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-static {p0, v4, p1, p2}, Lmn7;->b(Lzo8;Lkx4;Llp2;I)V

    .line 31
    .line 32
    .line 33
    return-object v3

    .line 34
    :pswitch_0
    check-cast p0, Lr68;

    .line 35
    .line 36
    check-cast v4, Lb71;

    .line 37
    .line 38
    move-object v5, p1

    .line 39
    check-cast v5, Le38;

    .line 40
    .line 41
    check-cast p2, Landroid/content/Context;

    .line 42
    .line 43
    invoke-virtual {p0}, Lr68;->m()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-object v0, p0, Lr68;->a:Lkd8;

    .line 48
    .line 49
    invoke-virtual {v0}, Lkd8;->d()Lh48;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v8, v1, Lh48;->Z:Ljava/lang/CharSequence;

    .line 54
    .line 55
    invoke-virtual {v0}, Lkd8;->d()Lh48;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-wide v9, v0, Lh48;->f0:J

    .line 60
    .line 61
    new-instance v0, Lf88;

    .line 62
    .line 63
    iget-object v0, p0, Lr68;->f:Lip5;

    .line 64
    .line 65
    move-object v7, v8

    .line 66
    move-wide v8, v9

    .line 67
    new-instance v10, Lv28;

    .line 68
    .line 69
    const/4 v1, 0x3

    .line 70
    invoke-direct {v10, p0, v4, p2, v1}, Lv28;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lpp5;->a:Lox1;

    .line 74
    .line 75
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v1, 0x1c

    .line 78
    .line 79
    if-lt p0, v1, :cond_0

    .line 80
    .line 81
    if-eqz v7, :cond_0

    .line 82
    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    instance-of p0, v0, Lop5;

    .line 86
    .line 87
    if-nez p0, :cond_1

    .line 88
    .line 89
    :cond_0
    move-object v6, p2

    .line 90
    move-object p0, v10

    .line 91
    move-wide v9, v8

    .line 92
    move-object v8, v7

    .line 93
    move v7, p1

    .line 94
    goto :goto_0

    .line 95
    :cond_1
    check-cast v0, Lop5;

    .line 96
    .line 97
    move-object v6, v5

    .line 98
    move-object v5, v0

    .line 99
    invoke-virtual/range {v5 .. v10}, Lop5;->a(Le38;Ljava/lang/CharSequence;JLv28;)V

    .line 100
    .line 101
    .line 102
    move-object v5, v6

    .line 103
    move-wide v9, v8

    .line 104
    move-object v6, p2

    .line 105
    move-object v8, v7

    .line 106
    move v7, p1

    .line 107
    invoke-static/range {v5 .. v10}, Lw39;->h(Le38;Landroid/content/Context;ZLjava/lang/CharSequence;J)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :goto_0
    invoke-virtual {p0, v5}, Lv28;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    if-eqz v8, :cond_2

    .line 115
    .line 116
    invoke-static/range {v5 .. v10}, Lw39;->h(Le38;Landroid/content/Context;ZLjava/lang/CharSequence;J)V

    .line 117
    .line 118
    .line 119
    :cond_2
    :goto_1
    return-object v3

    .line 120
    :pswitch_1
    check-cast p0, Lz48;

    .line 121
    .line 122
    check-cast v4, Lzy0;

    .line 123
    .line 124
    check-cast p1, Llp2;

    .line 125
    .line 126
    check-cast p2, Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    const/4 p2, 0x7

    .line 132
    invoke-static {p2}, Lw79;->P(I)I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    invoke-virtual {p0, v4, p1, p2}, Lz48;->j(Lzy0;Llp2;I)V

    .line 137
    .line 138
    .line 139
    return-object v3

    .line 140
    :pswitch_2
    check-cast p0, Lts2;

    .line 141
    .line 142
    check-cast v4, Landroid/graphics/drawable/Drawable;

    .line 143
    .line 144
    check-cast p1, Llp2;

    .line 145
    .line 146
    check-cast p2, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    const/16 p2, 0x31

    .line 152
    .line 153
    invoke-static {p2}, Lw79;->P(I)I

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    invoke-virtual {p0, v4, p1, p2}, Lts2;->b(Landroid/graphics/drawable/Drawable;Llp2;I)V

    .line 158
    .line 159
    .line 160
    return-object v3

    .line 161
    :pswitch_3
    check-cast p0, Lmu7;

    .line 162
    .line 163
    check-cast v4, Lkx4;

    .line 164
    .line 165
    check-cast p1, Llp2;

    .line 166
    .line 167
    check-cast p2, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v1}, Lw79;->P(I)I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-static {p0, v4, p1, p2}, Leu7;->b(Lmu7;Lkx4;Llp2;I)V

    .line 177
    .line 178
    .line 179
    return-object v3

    .line 180
    :pswitch_4
    check-cast p0, Lyt7;

    .line 181
    .line 182
    check-cast v4, Lkx4;

    .line 183
    .line 184
    check-cast p1, Llp2;

    .line 185
    .line 186
    check-cast p2, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {v1}, Lw79;->P(I)I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    invoke-static {p0, v4, p1, p2}, Lbt7;->b(Lyt7;Lkx4;Llp2;I)V

    .line 196
    .line 197
    .line 198
    return-object v3

    .line 199
    :pswitch_5
    check-cast p0, Lpv3;

    .line 200
    .line 201
    check-cast v4, Loh2;

    .line 202
    .line 203
    check-cast p1, Llp2;

    .line 204
    .line 205
    check-cast p2, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    and-int/lit8 v0, p2, 0x3

    .line 212
    .line 213
    const/4 v1, 0x2

    .line 214
    const/4 v5, 0x0

    .line 215
    if-eq v0, v1, :cond_3

    .line 216
    .line 217
    move v0, v2

    .line 218
    goto :goto_2

    .line 219
    :cond_3
    move v0, v5

    .line 220
    :goto_2
    and-int/2addr p2, v2

    .line 221
    invoke-virtual {p1, p2, v0}, Llp2;->N(IZ)Z

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    if-eqz p2, :cond_5

    .line 226
    .line 227
    sget-object p2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 228
    .line 229
    invoke-static {p2}, Lch3;->u(Lkx4;)Lkx4;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    sget-object v1, Lzz0;->a:Lbe;

    .line 238
    .line 239
    if-ne v0, v1, :cond_4

    .line 240
    .line 241
    new-instance v0, Lbz2;

    .line 242
    .line 243
    const/4 v1, 0x5

    .line 244
    invoke-direct {v0, v4, v1}, Lbz2;-><init>(Loh2;B)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_4
    check-cast v0, Lgn2;

    .line 251
    .line 252
    invoke-static {p2, v0}, Lz91;->C(Lkx4;Lgn2;)Lkx4;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    check-cast p0, Lgn2;

    .line 257
    .line 258
    invoke-static {v5, p0, p1, p2}, Lts7;->a(ILgn2;Llp2;Lkx4;)V

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_5
    invoke-virtual {p1}, Llp2;->Q()V

    .line 263
    .line 264
    .line 265
    :goto_3
    return-object v3

    .line 266
    :pswitch_6
    check-cast p0, Lp67;

    .line 267
    .line 268
    check-cast v4, Lza3;

    .line 269
    .line 270
    check-cast p1, Llp2;

    .line 271
    .line 272
    check-cast p2, Ljava/lang/Integer;

    .line 273
    .line 274
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    const/16 p2, 0x49

    .line 278
    .line 279
    invoke-static {p2}, Lw79;->P(I)I

    .line 280
    .line 281
    .line 282
    move-result p2

    .line 283
    invoke-static {p0, v4, p1, p2}, Ljb5;->f(Lp67;Lza3;Llp2;I)V

    .line 284
    .line 285
    .line 286
    return-object v3

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
