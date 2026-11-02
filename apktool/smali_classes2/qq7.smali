.class public final synthetic Lqq7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ly68;


# direct methods
.method public synthetic constructor <init>(Ly68;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lqq7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lqq7;->Y:Ly68;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lqq7;->X:B

    .line 4
    .line 5
    const/16 v2, 0x30

    .line 6
    .line 7
    const/high16 v3, 0x41c00000    # 24.0f

    .line 8
    .line 9
    sget-object v4, Lhx4;->X:Lhx4;

    .line 10
    .line 11
    sget-object v5, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    iget-object v0, v0, Lqq7;->Y:Ly68;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, Llp2;

    .line 24
    .line 25
    move-object/from16 v9, p2

    .line 26
    .line 27
    check-cast v9, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    and-int/lit8 v10, v9, 0x3

    .line 34
    .line 35
    if-eq v10, v6, :cond_0

    .line 36
    .line 37
    move v8, v7

    .line 38
    :cond_0
    and-int/lit8 v6, v9, 0x1

    .line 39
    .line 40
    invoke-virtual {v1, v6, v8}, Llp2;->N(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/b;->g(Lkx4;F)Lkx4;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v0, v3, v1, v2}, Lz91;->e(Ly68;Lkx4;Llp2;I)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v1}, Llp2;->Q()V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-object v5

    .line 58
    :pswitch_0
    move-object/from16 v1, p1

    .line 59
    .line 60
    check-cast v1, Llp2;

    .line 61
    .line 62
    move-object/from16 v9, p2

    .line 63
    .line 64
    check-cast v9, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    and-int/lit8 v10, v9, 0x3

    .line 71
    .line 72
    if-eq v10, v6, :cond_2

    .line 73
    .line 74
    move v8, v7

    .line 75
    :cond_2
    and-int/lit8 v6, v9, 0x1

    .line 76
    .line 77
    invoke-virtual {v1, v6, v8}, Llp2;->N(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_3

    .line 82
    .line 83
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/b;->g(Lkx4;F)Lkx4;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v0, v3, v1, v2}, Lz91;->e(Ly68;Lkx4;Llp2;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {v1}, Llp2;->Q()V

    .line 92
    .line 93
    .line 94
    :goto_1
    return-object v5

    .line 95
    :pswitch_1
    move-object/from16 v1, p1

    .line 96
    .line 97
    check-cast v1, Llp2;

    .line 98
    .line 99
    move-object/from16 v2, p2

    .line 100
    .line 101
    check-cast v2, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    and-int/lit8 v3, v2, 0x3

    .line 108
    .line 109
    if-eq v3, v6, :cond_4

    .line 110
    .line 111
    move v8, v7

    .line 112
    :cond_4
    and-int/2addr v2, v7

    .line 113
    invoke-virtual {v1, v2, v8}, Llp2;->N(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_6

    .line 118
    .line 119
    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 120
    .line 121
    const/4 v12, 0x0

    .line 122
    const/16 v13, 0xd

    .line 123
    .line 124
    const/4 v9, 0x0

    .line 125
    const/high16 v10, 0x40000000    # 2.0f

    .line 126
    .line 127
    const/4 v11, 0x0

    .line 128
    invoke-static/range {v8 .. v13}, Los4;->A(Lkx4;FFFFI)Lkx4;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    sget-object v3, Lht;->b:Lct;

    .line 133
    .line 134
    sget-object v4, Lpz2;->n0:Lo50;

    .line 135
    .line 136
    const/4 v6, 0x6

    .line 137
    invoke-static {v3, v4, v1, v6}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    iget-wide v9, v1, Llp2;->T:J

    .line 142
    .line 143
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    invoke-virtual {v1}, Llp2;->l()Lkl5;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-static {v1, v2}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    sget-object v9, Luz0;->j:Lpz2;

    .line 156
    .line 157
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Llp2;->Z()V

    .line 161
    .line 162
    .line 163
    iget-boolean v9, v1, Llp2;->S:Z

    .line 164
    .line 165
    if-eqz v9, :cond_5

    .line 166
    .line 167
    invoke-virtual {v1}, Llp2;->k()V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    invoke-virtual {v1}, Llp2;->j0()V

    .line 172
    .line 173
    .line 174
    :goto_2
    sget-object v9, Lpz2;->B0:Ldx0;

    .line 175
    .line 176
    invoke-static {v9, v1, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    sget-object v3, Lpz2;->A0:Ldx0;

    .line 180
    .line 181
    invoke-static {v3, v1, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    sget-object v4, Lpz2;->C0:Ldx0;

    .line 189
    .line 190
    invoke-static {v4, v1, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v1}, Lpn7;->l(Llp2;)V

    .line 194
    .line 195
    .line 196
    sget-object v3, Lpz2;->z0:Ldx0;

    .line 197
    .line 198
    invoke-static {v3, v1, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ly68;->c()Lh48;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget-object v0, v0, Lh48;->Z:Ljava/lang/CharSequence;

    .line 206
    .line 207
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    new-instance v2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v0, " / 25"

    .line 220
    .line 221
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    sget-object v2, Les;->a:Lox1;

    .line 229
    .line 230
    invoke-virtual {v1, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    check-cast v2, Lds;

    .line 235
    .line 236
    iget-object v9, v2, Lds;->d:Lo88;

    .line 237
    .line 238
    sget-object v2, Lep;->z:Lox1;

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, Ldp;

    .line 245
    .line 246
    iget-object v2, v2, Ldp;->c:Lxr;

    .line 247
    .line 248
    iget-wide v10, v2, Lxr;->c:J

    .line 249
    .line 250
    const/16 v20, 0x0

    .line 251
    .line 252
    const v21, 0xfffffe

    .line 253
    .line 254
    .line 255
    const-wide/16 v12, 0x0

    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const/4 v15, 0x0

    .line 259
    const-wide/16 v16, 0x0

    .line 260
    .line 261
    const-wide/16 v18, 0x0

    .line 262
    .line 263
    invoke-static/range {v9 .. v21}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    const/16 v18, 0x30

    .line 268
    .line 269
    const/16 v19, 0x1f0

    .line 270
    .line 271
    const/4 v11, 0x6

    .line 272
    const/4 v12, 0x0

    .line 273
    const/4 v13, 0x0

    .line 274
    const/4 v14, 0x0

    .line 275
    const/4 v15, 0x0

    .line 276
    const/16 v16, 0x0

    .line 277
    .line 278
    move-object/from16 v17, v1

    .line 279
    .line 280
    move-object v9, v8

    .line 281
    move-object v8, v0

    .line 282
    invoke-static/range {v8 .. v19}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 283
    .line 284
    .line 285
    move-object/from16 v0, v17

    .line 286
    .line 287
    invoke-virtual {v0, v7}, Llp2;->p(Z)V

    .line 288
    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_6
    move-object v0, v1

    .line 292
    invoke-virtual {v0}, Llp2;->Q()V

    .line 293
    .line 294
    .line 295
    :goto_3
    return-object v5

    .line 296
    :pswitch_2
    move-object/from16 v1, p1

    .line 297
    .line 298
    check-cast v1, Llp2;

    .line 299
    .line 300
    move-object/from16 v9, p2

    .line 301
    .line 302
    check-cast v9, Ljava/lang/Integer;

    .line 303
    .line 304
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    and-int/lit8 v10, v9, 0x3

    .line 309
    .line 310
    if-eq v10, v6, :cond_7

    .line 311
    .line 312
    move v8, v7

    .line 313
    :cond_7
    and-int/lit8 v6, v9, 0x1

    .line 314
    .line 315
    invoke-virtual {v1, v6, v8}, Llp2;->N(IZ)Z

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    if-eqz v6, :cond_8

    .line 320
    .line 321
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/b;->g(Lkx4;F)Lkx4;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-static {v0, v3, v1, v2}, Lz91;->e(Ly68;Lkx4;Llp2;I)V

    .line 326
    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_8
    invoke-virtual {v1}, Llp2;->Q()V

    .line 330
    .line 331
    .line 332
    :goto_4
    return-object v5

    .line 333
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
