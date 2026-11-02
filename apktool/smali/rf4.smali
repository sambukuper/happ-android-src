.class public final synthetic Lrf4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsf4;

.field public final synthetic Z:Lgn2;

.field public final synthetic f0:Lkx4;


# direct methods
.method public synthetic constructor <init>(Lsf4;Lgn2;Lkx4;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lrf4;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrf4;->Y:Lsf4;

    .line 8
    .line 9
    iput-object p2, p0, Lrf4;->Z:Lgn2;

    .line 10
    .line 11
    iput-object p3, p0, Lrf4;->f0:Lkx4;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lsf4;Lgn2;Lkx4;I)V
    .locals 0

    .line 14
    const/4 p4, 0x0

    iput-byte p4, p0, Lrf4;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf4;->Y:Lsf4;

    iput-object p2, p0, Lrf4;->Z:Lgn2;

    iput-object p3, p0, Lrf4;->f0:Lkx4;

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lrf4;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object v3, v0, Lrf4;->f0:Lkx4;

    .line 8
    .line 9
    iget-object v4, v0, Lrf4;->Z:Lgn2;

    .line 10
    .line 11
    iget-object v0, v0, Lrf4;->Y:Lsf4;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v10, p1

    .line 17
    .line 18
    check-cast v10, Llp2;

    .line 19
    .line 20
    move-object/from16 v1, p2

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    and-int/lit8 v5, v1, 0x3

    .line 29
    .line 30
    const/4 v13, 0x2

    .line 31
    const/4 v6, 0x1

    .line 32
    if-eq v5, v13, :cond_0

    .line 33
    .line 34
    move v5, v6

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v5, 0x0

    .line 37
    :goto_0
    and-int/2addr v1, v6

    .line 38
    invoke-virtual {v10, v1, v5}, Llp2;->N(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_a

    .line 43
    .line 44
    sget v1, Ly46;->logs_core:I

    .line 45
    .line 46
    invoke-static {v1, v10}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object v1, v0, Lsf4;->a:Le69;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    const v1, -0x1532651

    .line 57
    .line 58
    .line 59
    invoke-virtual {v10, v1}, Llp2;->W(I)V

    .line 60
    .line 61
    .line 62
    sget-object v1, Lec7;->Y:Lec7;

    .line 63
    .line 64
    invoke-virtual {v1}, Lec7;->c()Lqm5;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    sget-object v7, Le69;->i0:Ln22;

    .line 69
    .line 70
    invoke-virtual {v7}, Lz1;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    const/4 v15, 0x0

    .line 79
    sget-object v11, Lzz0;->a:Lbe;

    .line 80
    .line 81
    if-eqz v9, :cond_3

    .line 82
    .line 83
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    check-cast v9, Le69;

    .line 88
    .line 89
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 94
    .line 95
    invoke-virtual {v12, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v10, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    invoke-virtual {v10, v14}, Llp2;->d(I)Z

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    or-int/2addr v13, v14

    .line 115
    invoke-virtual {v10}, Llp2;->K()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v14

    .line 119
    if-nez v13, :cond_1

    .line 120
    .line 121
    if-ne v14, v11, :cond_2

    .line 122
    .line 123
    :cond_1
    new-instance v14, La23;

    .line 124
    .line 125
    const/4 v11, 0x4

    .line 126
    invoke-direct {v14, v4, v9, v11}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v10, v14}, Llp2;->g0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_2
    check-cast v14, Ldn2;

    .line 133
    .line 134
    new-instance v9, Lmw2;

    .line 135
    .line 136
    invoke-direct {v9, v12, v15, v14}, Lmw2;-><init>(Ljava/lang/String;Lg73;Ldn2;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v9}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    const/4 v13, 0x2

    .line 143
    goto :goto_1

    .line 144
    :cond_3
    invoke-virtual {v6}, Lqm5;->c()Lj2;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    const/4 v7, 0x0

    .line 149
    invoke-virtual {v10, v7}, Llp2;->p(Z)V

    .line 150
    .line 151
    .line 152
    move-object v7, v11

    .line 153
    const/4 v11, 0x0

    .line 154
    const/16 v12, 0x34

    .line 155
    .line 156
    move-object v9, v7

    .line 157
    const/4 v7, 0x0

    .line 158
    move-object v13, v9

    .line 159
    const/4 v9, 0x0

    .line 160
    invoke-static/range {v5 .. v12}, Lys0;->g(Ljava/lang/String;Lb83;Lkx4;ILtn2;Llp2;II)V

    .line 161
    .line 162
    .line 163
    sget-object v5, Lss8;->a:Lss8;

    .line 164
    .line 165
    invoke-static {}, Lss8;->t()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_7

    .line 170
    .line 171
    const v5, -0x290c937e

    .line 172
    .line 173
    .line 174
    invoke-virtual {v10, v5}, Llp2;->W(I)V

    .line 175
    .line 176
    .line 177
    sget v5, Ly46;->logs_output:I

    .line 178
    .line 179
    invoke-static {v5, v10}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    iget-object v0, v0, Lsf4;->b:Lnf4;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    const v0, -0x152e41d

    .line 190
    .line 191
    .line 192
    invoke-virtual {v10, v0}, Llp2;->W(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Lec7;->c()Lqm5;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sget-object v1, Lnf4;->g0:Ln22;

    .line 200
    .line 201
    invoke-virtual {v1}, Lz1;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-eqz v6, :cond_6

    .line 210
    .line 211
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    check-cast v6, Lnf4;

    .line 216
    .line 217
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 222
    .line 223
    invoke-virtual {v7, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v10, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    invoke-virtual {v10, v11}, Llp2;->d(I)Z

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    or-int/2addr v9, v11

    .line 243
    invoke-virtual {v10}, Llp2;->K()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    if-nez v9, :cond_4

    .line 248
    .line 249
    if-ne v11, v13, :cond_5

    .line 250
    .line 251
    :cond_4
    new-instance v11, La23;

    .line 252
    .line 253
    const/4 v9, 0x5

    .line 254
    invoke-direct {v11, v4, v6, v9}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v10, v11}, Llp2;->g0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_5
    check-cast v11, Ldn2;

    .line 261
    .line 262
    new-instance v6, Lmw2;

    .line 263
    .line 264
    invoke-direct {v6, v7, v15, v11}, Lmw2;-><init>(Ljava/lang/String;Lg73;Ldn2;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v6}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_6
    invoke-virtual {v0}, Lqm5;->c()Lj2;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    const/4 v0, 0x0

    .line 276
    invoke-virtual {v10, v0}, Llp2;->p(Z)V

    .line 277
    .line 278
    .line 279
    const/4 v11, 0x0

    .line 280
    const/16 v12, 0x34

    .line 281
    .line 282
    const/4 v7, 0x0

    .line 283
    const/4 v9, 0x0

    .line 284
    invoke-static/range {v5 .. v12}, Lys0;->g(Ljava/lang/String;Lb83;Lkx4;ILtn2;Llp2;II)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v10, v0}, Llp2;->p(Z)V

    .line 288
    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_7
    const/4 v0, 0x0

    .line 292
    const v1, -0x2904180a

    .line 293
    .line 294
    .line 295
    invoke-virtual {v10, v1}, Llp2;->W(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v10, v0}, Llp2;->p(Z)V

    .line 299
    .line 300
    .line 301
    :goto_3
    sget v0, Ly46;->logs_view:I

    .line 302
    .line 303
    invoke-static {v0, v10}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v10, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    invoke-virtual {v10}, Llp2;->K()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    if-nez v1, :cond_8

    .line 316
    .line 317
    if-ne v5, v13, :cond_9

    .line 318
    .line 319
    :cond_8
    new-instance v5, Lba3;

    .line 320
    .line 321
    const/4 v1, 0x2

    .line 322
    invoke-direct {v5, v4, v1}, Lba3;-><init>(Lgn2;B)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v10, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    :cond_9
    check-cast v5, Ldn2;

    .line 329
    .line 330
    const/16 v1, 0x180

    .line 331
    .line 332
    invoke-static {v0, v5, v3, v10, v1}, Lnr4;->a(Ljava/lang/String;Ldn2;Lkx4;Llp2;I)V

    .line 333
    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_a
    invoke-virtual {v10}, Llp2;->Q()V

    .line 337
    .line 338
    .line 339
    :goto_4
    return-object v2

    .line 340
    :pswitch_0
    move-object/from16 v1, p1

    .line 341
    .line 342
    check-cast v1, Llp2;

    .line 343
    .line 344
    move-object/from16 v5, p2

    .line 345
    .line 346
    check-cast v5, Ljava/lang/Integer;

    .line 347
    .line 348
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    const/16 v5, 0x181

    .line 352
    .line 353
    invoke-static {v5}, Lw79;->P(I)I

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    invoke-static {v0, v4, v3, v1, v5}, Los4;->c(Lsf4;Lgn2;Lkx4;Llp2;I)V

    .line 358
    .line 359
    .line 360
    return-object v2

    .line 361
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
