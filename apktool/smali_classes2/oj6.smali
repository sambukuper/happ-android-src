.class public final synthetic Loj6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Ldn2;

.field public final synthetic Z:Landroid/content/Context;

.field public final synthetic f0:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(ZLdn2;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Loj6;->X:Z

    .line 5
    .line 6
    iput-object p2, p0, Loj6;->Y:Ldn2;

    .line 7
    .line 8
    iput-object p3, p0, Loj6;->Z:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p4, p0, Loj6;->f0:Landroid/content/Intent;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    check-cast v13, Llp2;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v5

    .line 25
    :goto_0
    and-int/2addr v1, v4

    .line 26
    invoke-virtual {v13, v1, v2}, Llp2;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    sget-object v1, Lpz2;->o0:Lo50;

    .line 33
    .line 34
    new-instance v2, Lft;

    .line 35
    .line 36
    new-instance v3, Lbt;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    const/high16 v6, 0x41000000    # 8.0f

    .line 42
    .line 43
    invoke-direct {v2, v6, v3}, Lft;-><init>(FLbt;)V

    .line 44
    .line 45
    .line 46
    const/16 v3, 0x36

    .line 47
    .line 48
    invoke-static {v2, v1, v13, v3}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-wide v2, v13, Llp2;->T:J

    .line 53
    .line 54
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {v13}, Llp2;->l()Lkl5;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    sget-object v6, Lhx4;->X:Lhx4;

    .line 63
    .line 64
    invoke-static {v13, v6}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    sget-object v7, Luz0;->j:Lpz2;

    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v13}, Llp2;->Z()V

    .line 74
    .line 75
    .line 76
    iget-boolean v7, v13, Llp2;->S:Z

    .line 77
    .line 78
    if-eqz v7, :cond_1

    .line 79
    .line 80
    invoke-virtual {v13}, Llp2;->k()V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {v13}, Llp2;->j0()V

    .line 85
    .line 86
    .line 87
    :goto_1
    sget-object v7, Lpz2;->B0:Ldx0;

    .line 88
    .line 89
    invoke-static {v7, v13, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 93
    .line 94
    invoke-static {v1, v13, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 102
    .line 103
    invoke-static {v2, v13, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v13}, Lpn7;->l(Llp2;)V

    .line 107
    .line 108
    .line 109
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 110
    .line 111
    invoke-static {v1, v13, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-boolean v1, v0, Loj6;->X:Z

    .line 115
    .line 116
    iget-object v12, v0, Loj6;->Y:Ldn2;

    .line 117
    .line 118
    if-nez v1, :cond_2

    .line 119
    .line 120
    const v1, 0x4a381a1b    # 3016326.8f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v13, v1}, Llp2;->W(I)V

    .line 124
    .line 125
    .line 126
    sget v1, Ly46;->dialog_input_in_center_button_negative:I

    .line 127
    .line 128
    invoke-static {v1, v13}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    sget-object v2, Les;->a:Lox1;

    .line 133
    .line 134
    invoke-virtual {v13, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Lds;

    .line 139
    .line 140
    iget-object v14, v2, Lds;->c:Lo88;

    .line 141
    .line 142
    sget-object v2, Lep;->z:Lox1;

    .line 143
    .line 144
    invoke-virtual {v13, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Ldp;

    .line 149
    .line 150
    iget-object v2, v2, Ldp;->c:Lxr;

    .line 151
    .line 152
    iget-wide v2, v2, Lxr;->a:J

    .line 153
    .line 154
    sget-object v19, Ldj2;->f0:Ldj2;

    .line 155
    .line 156
    const/16 v25, 0x0

    .line 157
    .line 158
    const v26, 0xfffffa

    .line 159
    .line 160
    .line 161
    const-wide/16 v17, 0x0

    .line 162
    .line 163
    const/16 v20, 0x0

    .line 164
    .line 165
    const-wide/16 v21, 0x0

    .line 166
    .line 167
    const-wide/16 v23, 0x0

    .line 168
    .line 169
    move-wide v15, v2

    .line 170
    invoke-static/range {v14 .. v26}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    const/high16 v14, 0x180000

    .line 175
    .line 176
    const/16 v15, 0xfb6

    .line 177
    .line 178
    move v3, v4

    .line 179
    move-object v4, v2

    .line 180
    const/4 v2, 0x0

    .line 181
    move v6, v3

    .line 182
    const/4 v3, 0x0

    .line 183
    move v7, v5

    .line 184
    const/4 v5, 0x0

    .line 185
    move v8, v6

    .line 186
    const/4 v6, 0x0

    .line 187
    move v9, v7

    .line 188
    const/4 v7, 0x1

    .line 189
    move v10, v8

    .line 190
    const/4 v8, 0x0

    .line 191
    move v11, v9

    .line 192
    const/4 v9, 0x0

    .line 193
    move/from16 v16, v10

    .line 194
    .line 195
    const/4 v10, 0x0

    .line 196
    move/from16 v17, v11

    .line 197
    .line 198
    const/4 v11, 0x0

    .line 199
    move/from16 v0, v17

    .line 200
    .line 201
    invoke-static/range {v1 .. v15}, Lz51;->g(Ljava/lang/String;Lkx4;ZLo88;IIIIZLig5;Lx67;Ldn2;Llp2;II)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v13, v0}, Llp2;->p(Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_2
    move v0, v5

    .line 209
    const v1, 0x4a3f09b4    # 3129965.0f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v13, v1}, Llp2;->W(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v13, v0}, Llp2;->p(Z)V

    .line 216
    .line 217
    .line 218
    :goto_2
    sget v0, Ly46;->title_settings:I

    .line 219
    .line 220
    invoke-static {v0, v13}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    sget-object v1, Les;->a:Lox1;

    .line 225
    .line 226
    invoke-virtual {v13, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    check-cast v1, Lds;

    .line 231
    .line 232
    iget-object v14, v1, Lds;->c:Lo88;

    .line 233
    .line 234
    sget-object v19, Ldj2;->f0:Ldj2;

    .line 235
    .line 236
    sget-object v1, Lep;->z:Lox1;

    .line 237
    .line 238
    invoke-virtual {v13, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    check-cast v1, Ldp;

    .line 243
    .line 244
    iget-wide v1, v1, Ldp;->a:J

    .line 245
    .line 246
    const/16 v25, 0x0

    .line 247
    .line 248
    const v26, 0xfffffa

    .line 249
    .line 250
    .line 251
    const-wide/16 v17, 0x0

    .line 252
    .line 253
    const/16 v20, 0x0

    .line 254
    .line 255
    const-wide/16 v21, 0x0

    .line 256
    .line 257
    const-wide/16 v23, 0x0

    .line 258
    .line 259
    move-wide v15, v1

    .line 260
    invoke-static/range {v14 .. v26}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    move-object/from16 v1, p0

    .line 265
    .line 266
    iget-object v2, v1, Loj6;->Z:Landroid/content/Context;

    .line 267
    .line 268
    invoke-virtual {v13, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    iget-object v1, v1, Loj6;->f0:Landroid/content/Intent;

    .line 273
    .line 274
    invoke-virtual {v13, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    or-int/2addr v4, v5

    .line 279
    invoke-virtual {v13, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    or-int/2addr v4, v5

    .line 284
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    if-nez v4, :cond_3

    .line 289
    .line 290
    sget-object v4, Lzz0;->a:Lbe;

    .line 291
    .line 292
    if-ne v5, v4, :cond_4

    .line 293
    .line 294
    :cond_3
    new-instance v5, Lg00;

    .line 295
    .line 296
    const/16 v4, 0x12

    .line 297
    .line 298
    invoke-direct {v5, v2, v1, v12, v4}, Lg00;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v13, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :cond_4
    move-object v11, v5

    .line 305
    check-cast v11, Ldn2;

    .line 306
    .line 307
    move-object v12, v13

    .line 308
    const/high16 v13, 0x180000

    .line 309
    .line 310
    const/16 v14, 0xfb6

    .line 311
    .line 312
    const/4 v1, 0x0

    .line 313
    const/4 v2, 0x0

    .line 314
    const/4 v4, 0x0

    .line 315
    const/4 v5, 0x0

    .line 316
    const/4 v6, 0x1

    .line 317
    const/4 v7, 0x0

    .line 318
    const/4 v8, 0x0

    .line 319
    const/4 v9, 0x0

    .line 320
    const/4 v10, 0x0

    .line 321
    invoke-static/range {v0 .. v14}, Lz51;->g(Ljava/lang/String;Lkx4;ZLo88;IIIIZLig5;Lx67;Ldn2;Llp2;II)V

    .line 322
    .line 323
    .line 324
    move-object v13, v12

    .line 325
    const/4 v3, 0x1

    .line 326
    invoke-virtual {v13, v3}, Llp2;->p(Z)V

    .line 327
    .line 328
    .line 329
    goto :goto_3

    .line 330
    :cond_5
    invoke-virtual {v13}, Llp2;->Q()V

    .line 331
    .line 332
    .line 333
    :goto_3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 334
    .line 335
    return-object v0
.end method
