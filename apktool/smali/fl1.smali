.class public final Lfl1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ll5;

.field public final synthetic b:B


# direct methods
.method public constructor <init>(Ll5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lfl1;->b:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lfl1;->a:Ll5;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Li86;Ljd1;Led1;)Z
    .locals 5

    .line 1
    iget-byte v0, p0, Lfl1;->b:B

    .line 2
    .line 3
    const-class v1, Lsx4;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2, p3}, Lek3;->b(Li86;Ljd1;Led1;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    invoke-static {p1, p2, p3}, Lek3;->b(Li86;Ljd1;Led1;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :pswitch_1
    invoke-static {p2, p3}, Lek3;->a(Ljd1;Led1;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :pswitch_2
    return v3

    .line 26
    :pswitch_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string p1, "Visibility is unknown yet"

    .line 29
    .line 30
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :pswitch_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string p1, "This method shouldn\'t be invoked for LOCAL visibility"

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0

    .line 42
    :pswitch_5
    return v2

    .line 43
    :pswitch_6
    invoke-static {p2}, Lbl1;->c(Led1;)Lvx4;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p3}, Lbl1;->c(Led1;)Lvx4;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1, p0}, Lvx4;->A(Lvx4;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_0

    .line 56
    .line 57
    move v2, v3

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    sget-object p0, Lgl1;->n:Lxx4;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    :goto_0
    return v2

    .line 65
    :pswitch_7
    if-eqz p3, :cond_c

    .line 66
    .line 67
    invoke-static {p2, v1, v2}, Lbl1;->h(Led1;Ljava/lang/Class;Z)Led1;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lsx4;

    .line 72
    .line 73
    invoke-static {p3, v1, v3}, Lbl1;->h(Led1;Ljava/lang/Class;Z)Led1;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    check-cast p3, Lsx4;

    .line 78
    .line 79
    if-nez p3, :cond_1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_1
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-static {v0}, Lbl1;->k(Led1;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, Lbl1;->h(Led1;Ljava/lang/Class;Z)Led1;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lsx4;

    .line 95
    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    invoke-virtual {p3}, Lsx4;->X()Laa7;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v0}, Lsx4;->n0()Lsx4;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v4, v0}, Lbl1;->p(Lt14;Led1;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_2
    instance-of v0, p2, Lld0;

    .line 114
    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    move-object v0, p2

    .line 118
    check-cast v0, Lld0;

    .line 119
    .line 120
    invoke-static {v0}, Lbl1;->r(Lld0;)Lld0;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    goto :goto_1

    .line 125
    :cond_3
    move-object v0, p2

    .line 126
    :goto_1
    invoke-static {v0, v1, v2}, Lbl1;->h(Led1;Ljava/lang/Class;Z)Led1;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Lsx4;

    .line 131
    .line 132
    if-nez v1, :cond_4

    .line 133
    .line 134
    :goto_2
    move v2, v3

    .line 135
    goto :goto_4

    .line 136
    :cond_4
    invoke-virtual {p3}, Lsx4;->X()Laa7;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v1}, Lsx4;->n0()Lsx4;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v3, v1}, Lbl1;->p(Lt14;Led1;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_a

    .line 149
    .line 150
    sget-object v1, Lgl1;->m:Lbe;

    .line 151
    .line 152
    if-ne p1, v1, :cond_5

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    instance-of v1, v0, Lld0;

    .line 156
    .line 157
    if-nez v1, :cond_6

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_6
    instance-of v0, v0, La41;

    .line 161
    .line 162
    if-eqz v0, :cond_7

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_7
    sget-object v0, Lgl1;->l:Lra;

    .line 166
    .line 167
    if-ne p1, v0, :cond_8

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_8
    sget-object v0, Lgl1;->k:Lbe;

    .line 171
    .line 172
    if-eq p1, v0, :cond_a

    .line 173
    .line 174
    if-nez p1, :cond_9

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_9
    invoke-interface {p1}, Li86;->c()Lt14;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0, p3}, Lbl1;->p(Lt14;Led1;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_b

    .line 186
    .line 187
    invoke-virtual {v0}, Lt14;->q0()Lmo8;

    .line 188
    .line 189
    .line 190
    :cond_a
    :goto_3
    invoke-interface {p3}, Led1;->p()Led1;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    invoke-virtual {p0, p1, p2, p3}, Lfl1;->a(Li86;Ljd1;Led1;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    :cond_b
    :goto_4
    return v2

    .line 199
    :cond_c
    const/4 p0, 0x3

    .line 200
    new-array p0, p0, [Ljava/lang/Object;

    .line 201
    .line 202
    const-string p1, "from"

    .line 203
    .line 204
    aput-object p1, p0, v3

    .line 205
    .line 206
    const-string p1, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3"

    .line 207
    .line 208
    aput-object p1, p0, v2

    .line 209
    .line 210
    const-string p1, "isVisible"

    .line 211
    .line 212
    const/4 p2, 0x2

    .line 213
    aput-object p1, p0, p2

    .line 214
    .line 215
    const-string p1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 216
    .line 217
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 222
    .line 223
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p1

    .line 227
    :pswitch_8
    sget-object p0, Lgl1;->a:Lfl1;

    .line 228
    .line 229
    invoke-virtual {p0, p1, p2, p3}, Lfl1;->a(Li86;Ljd1;Led1;)Z

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    if-eqz p0, :cond_f

    .line 234
    .line 235
    sget-object p0, Lgl1;->l:Lra;

    .line 236
    .line 237
    if-ne p1, p0, :cond_d

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_d
    sget-object p0, Lgl1;->k:Lbe;

    .line 241
    .line 242
    if-ne p1, p0, :cond_e

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_e
    invoke-static {p2, v1, v2}, Lbl1;->h(Led1;Ljava/lang/Class;Z)Led1;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    if-eqz p0, :cond_f

    .line 250
    .line 251
    instance-of p2, p1, Ld83;

    .line 252
    .line 253
    if-eqz p2, :cond_f

    .line 254
    .line 255
    check-cast p1, Ld83;

    .line 256
    .line 257
    iget-object p1, p1, Ld83;->X:Lsx4;

    .line 258
    .line 259
    invoke-virtual {p1}, Lsx4;->n0()Lsx4;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-interface {p0}, Led1;->a()Led1;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    goto :goto_6

    .line 272
    :cond_f
    :goto_5
    move v2, v3

    .line 273
    :goto_6
    return v2

    .line 274
    :pswitch_9
    invoke-static {p2}, Lbl1;->q(Led1;)Z

    .line 275
    .line 276
    .line 277
    move-result p0

    .line 278
    if-eqz p0, :cond_10

    .line 279
    .line 280
    invoke-static {p3}, Lbl1;->e(Led1;)Llh4;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    sget-object p1, Llh4;->F0:Llh4;

    .line 285
    .line 286
    if-eq p0, p1, :cond_10

    .line 287
    .line 288
    invoke-static {p2, p3}, Lgl1;->d(Led1;Led1;)Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    goto :goto_9

    .line 293
    :cond_10
    instance-of p0, p2, La41;

    .line 294
    .line 295
    if-eqz p0, :cond_11

    .line 296
    .line 297
    move-object p0, p2

    .line 298
    check-cast p0, La41;

    .line 299
    .line 300
    invoke-interface {p0}, La41;->p()Lpt0;

    .line 301
    .line 302
    .line 303
    :cond_11
    if-eqz p2, :cond_13

    .line 304
    .line 305
    invoke-interface {p2}, Led1;->p()Led1;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    instance-of p0, p2, Lsx4;

    .line 310
    .line 311
    if-eqz p0, :cond_12

    .line 312
    .line 313
    invoke-static {p2}, Lbl1;->k(Led1;)Z

    .line 314
    .line 315
    .line 316
    move-result p0

    .line 317
    if-eqz p0, :cond_13

    .line 318
    .line 319
    :cond_12
    instance-of p0, p2, Ltf5;

    .line 320
    .line 321
    if-eqz p0, :cond_11

    .line 322
    .line 323
    :cond_13
    if-nez p2, :cond_14

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_14
    :goto_7
    if-eqz p3, :cond_17

    .line 327
    .line 328
    if-ne p2, p3, :cond_15

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_15
    instance-of p0, p3, Ltf5;

    .line 332
    .line 333
    if-eqz p0, :cond_16

    .line 334
    .line 335
    instance-of p0, p2, Ltf5;

    .line 336
    .line 337
    if-eqz p0, :cond_17

    .line 338
    .line 339
    move-object p0, p2

    .line 340
    check-cast p0, Ltf5;

    .line 341
    .line 342
    check-cast p0, Luf5;

    .line 343
    .line 344
    iget-object p0, p0, Luf5;->i0:Lfk2;

    .line 345
    .line 346
    move-object p1, p3

    .line 347
    check-cast p1, Ltf5;

    .line 348
    .line 349
    check-cast p1, Luf5;

    .line 350
    .line 351
    iget-object p1, p1, Luf5;->i0:Lfk2;

    .line 352
    .line 353
    invoke-virtual {p0, p1}, Lfk2;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result p0

    .line 357
    if-eqz p0, :cond_17

    .line 358
    .line 359
    invoke-static {p3}, Lbl1;->c(Led1;)Lvx4;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    invoke-static {p2}, Lbl1;->c(Led1;)Lvx4;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result p0

    .line 371
    if-eqz p0, :cond_17

    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_16
    invoke-interface {p3}, Led1;->p()Led1;

    .line 375
    .line 376
    .line 377
    move-result-object p3

    .line 378
    goto :goto_7

    .line 379
    :cond_17
    :goto_8
    move v2, v3

    .line 380
    :goto_9
    return v2

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lfl1;->a:Ll5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ll5;->d()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
