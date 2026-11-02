.class public final synthetic Ljn7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lqn7;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lqn7;Lgn2;Lkx4;IB)V
    .locals 0

    .line 14
    iput-byte p5, p0, Ljn7;->X:B

    iput-object p1, p0, Ljn7;->Y:Lqn7;

    iput-object p2, p0, Ljn7;->f0:Lgn2;

    iput-object p3, p0, Ljn7;->Z:Lkx4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lqn7;Lkx4;Lgn2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Ljn7;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ljn7;->Y:Lqn7;

    .line 8
    .line 9
    iput-object p2, p0, Ljn7;->Z:Lkx4;

    .line 10
    .line 11
    iput-object p3, p0, Ljn7;->f0:Lgn2;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Ljn7;->X:B

    .line 4
    .line 5
    const/16 v2, 0x181

    .line 6
    .line 7
    iget-object v3, v0, Ljn7;->Z:Lkx4;

    .line 8
    .line 9
    sget-object v4, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    iget-object v5, v0, Ljn7;->f0:Lgn2;

    .line 12
    .line 13
    iget-object v6, v0, Ljn7;->Y:Lqn7;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, Llp2;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lw79;->P(I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v6, v5, v3, v0, v1}, Lpn7;->e(Lqn7;Lgn2;Lkx4;Llp2;I)V

    .line 34
    .line 35
    .line 36
    return-object v4

    .line 37
    :pswitch_0
    move-object/from16 v0, p1

    .line 38
    .line 39
    check-cast v0, Llp2;

    .line 40
    .line 41
    move-object/from16 v1, p2

    .line 42
    .line 43
    check-cast v1, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, Lw79;->P(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {v6, v5, v3, v0, v1}, Lpn7;->f(Lqn7;Lgn2;Lkx4;Llp2;I)V

    .line 53
    .line 54
    .line 55
    return-object v4

    .line 56
    :pswitch_1
    move-object/from16 v14, p1

    .line 57
    .line 58
    check-cast v14, Llp2;

    .line 59
    .line 60
    move-object/from16 v1, p2

    .line 61
    .line 62
    check-cast v1, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    and-int/lit8 v2, v1, 0x3

    .line 69
    .line 70
    const/4 v3, 0x2

    .line 71
    const/4 v7, 0x1

    .line 72
    const/4 v8, 0x0

    .line 73
    if-eq v2, v3, :cond_0

    .line 74
    .line 75
    move v2, v7

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move v2, v8

    .line 78
    :goto_0
    and-int/2addr v1, v7

    .line 79
    invoke-virtual {v14, v1, v2}, Llp2;->N(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_b

    .line 84
    .line 85
    sget v1, Ly46;->sub_routing_general_sub_name:I

    .line 86
    .line 87
    invoke-static {v1, v14}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v2, v6, Lqn7;->b:Ljava/lang/String;

    .line 92
    .line 93
    iget-boolean v3, v6, Lqn7;->c:Z

    .line 94
    .line 95
    const-string v9, ""

    .line 96
    .line 97
    if-nez v2, :cond_1

    .line 98
    .line 99
    const v2, 0x3c24e4e1

    .line 100
    .line 101
    .line 102
    invoke-virtual {v14, v2}, Llp2;->W(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v14, v8}, Llp2;->p(Z)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    invoke-virtual {v2, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_2

    .line 114
    .line 115
    const v2, -0x16d57cb9

    .line 116
    .line 117
    .line 118
    invoke-virtual {v14, v2}, Llp2;->W(I)V

    .line 119
    .line 120
    .line 121
    sget v2, Ly46;->title_server_list:I

    .line 122
    .line 123
    invoke-static {v2, v14}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    invoke-virtual {v14, v8}, Llp2;->p(Z)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    const v2, -0x16d5733c

    .line 132
    .line 133
    .line 134
    invoke-virtual {v14, v2}, Llp2;->W(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v14, v8}, Llp2;->p(Z)V

    .line 138
    .line 139
    .line 140
    iget-object v9, v6, Lqn7;->b:Ljava/lang/String;

    .line 141
    .line 142
    :goto_1
    const/16 v2, 0x180

    .line 143
    .line 144
    iget-object v10, v0, Ljn7;->Z:Lkx4;

    .line 145
    .line 146
    invoke-static {v1, v9, v10, v14, v2}, Lu15;->a(Ljava/lang/String;Ljava/lang/String;Lkx4;Llp2;I)V

    .line 147
    .line 148
    .line 149
    sget v0, Ly46;->sub_routing_general_enable_routing:I

    .line 150
    .line 151
    invoke-static {v0, v14}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    move v1, v8

    .line 156
    iget-boolean v8, v6, Lqn7;->d:Z

    .line 157
    .line 158
    iget-object v2, v6, Lqn7;->f:Lb83;

    .line 159
    .line 160
    if-eqz v2, :cond_3

    .line 161
    .line 162
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    xor-int/2addr v2, v7

    .line 167
    if-ne v2, v7, :cond_3

    .line 168
    .line 169
    if-nez v3, :cond_3

    .line 170
    .line 171
    move v11, v7

    .line 172
    goto :goto_2

    .line 173
    :cond_3
    move v11, v1

    .line 174
    :goto_2
    invoke-virtual {v14, v5}, Llp2;->f(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    sget-object v9, Lzz0;->a:Lbe;

    .line 183
    .line 184
    if-nez v2, :cond_4

    .line 185
    .line 186
    if-ne v7, v9, :cond_5

    .line 187
    .line 188
    :cond_4
    new-instance v7, Lpr2;

    .line 189
    .line 190
    const/4 v2, 0x3

    .line 191
    invoke-direct {v7, v5, v2}, Lpr2;-><init>(Lgn2;B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v14, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_5
    check-cast v7, Lgn2;

    .line 198
    .line 199
    invoke-virtual {v14, v6}, Llp2;->f(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    invoke-virtual {v14, v5}, Llp2;->f(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    or-int/2addr v2, v12

    .line 208
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    if-nez v2, :cond_6

    .line 213
    .line 214
    if-ne v12, v9, :cond_7

    .line 215
    .line 216
    :cond_6
    new-instance v12, Lgq6;

    .line 217
    .line 218
    const/16 v2, 0x8

    .line 219
    .line 220
    invoke-direct {v12, v6, v5, v2}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v14, v12}, Llp2;->g0(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    :cond_7
    move-object v13, v12

    .line 227
    check-cast v13, Lgn2;

    .line 228
    .line 229
    const/16 v15, 0xc00

    .line 230
    .line 231
    const/16 v16, 0x60

    .line 232
    .line 233
    const/4 v12, 0x0

    .line 234
    move-object/from16 v17, v7

    .line 235
    .line 236
    move-object v7, v0

    .line 237
    move-object v0, v9

    .line 238
    move-object/from16 v9, v17

    .line 239
    .line 240
    invoke-static/range {v7 .. v16}, Lg33;->a(Ljava/lang/String;ZLgn2;Lkx4;ZLjava/lang/String;Lgn2;Llp2;II)V

    .line 241
    .line 242
    .line 243
    if-nez v3, :cond_a

    .line 244
    .line 245
    const v2, 0x3c35a3f8

    .line 246
    .line 247
    .line 248
    invoke-virtual {v14, v2}, Llp2;->W(I)V

    .line 249
    .line 250
    .line 251
    sget v2, Ly46;->sub_routing_general_ignore_routing_import:I

    .line 252
    .line 253
    invoke-static {v2, v14}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    iget-boolean v8, v6, Lqn7;->e:Z

    .line 258
    .line 259
    invoke-virtual {v14, v5}, Llp2;->f(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    if-nez v2, :cond_8

    .line 268
    .line 269
    if-ne v3, v0, :cond_9

    .line 270
    .line 271
    :cond_8
    new-instance v3, Lpr2;

    .line 272
    .line 273
    const/4 v0, 0x4

    .line 274
    invoke-direct {v3, v5, v0}, Lpr2;-><init>(Lgn2;B)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v14, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_9
    move-object v9, v3

    .line 281
    check-cast v9, Lgn2;

    .line 282
    .line 283
    const/16 v15, 0xc00

    .line 284
    .line 285
    const/16 v16, 0xf0

    .line 286
    .line 287
    const/4 v11, 0x0

    .line 288
    const/4 v12, 0x0

    .line 289
    const/4 v13, 0x0

    .line 290
    invoke-static/range {v7 .. v16}, Lg33;->a(Ljava/lang/String;ZLgn2;Lkx4;ZLjava/lang/String;Lgn2;Llp2;II)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v14, v1}, Llp2;->p(Z)V

    .line 294
    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_a
    const v0, 0x3c3bac85

    .line 298
    .line 299
    .line 300
    invoke-virtual {v14, v0}, Llp2;->W(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v14, v1}, Llp2;->p(Z)V

    .line 304
    .line 305
    .line 306
    goto :goto_3

    .line 307
    :cond_b
    invoke-virtual {v14}, Llp2;->Q()V

    .line 308
    .line 309
    .line 310
    :goto_3
    return-object v4

    .line 311
    :pswitch_2
    move-object/from16 v0, p1

    .line 312
    .line 313
    check-cast v0, Llp2;

    .line 314
    .line 315
    move-object/from16 v1, p2

    .line 316
    .line 317
    check-cast v1, Ljava/lang/Integer;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-static {v2}, Lw79;->P(I)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    invoke-static {v6, v5, v3, v0, v1}, Lln7;->a(Lqn7;Lgn2;Lkx4;Llp2;I)V

    .line 327
    .line 328
    .line 329
    return-object v4

    .line 330
    nop

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
