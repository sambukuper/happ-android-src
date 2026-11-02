.class public final Lci4;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public final c:Loh7;

.field public final d:Lh76;

.field public final e:Lu77;

.field public final f:Lf76;

.field public g:Log7;

.field public volatile h:Ljava/lang/Process;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsh4;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lsh4;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lvz7;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lci4;->b:Lvz7;

    .line 16
    .line 17
    sget-object v0, Lmg4;->a:Lmg4;

    .line 18
    .line 19
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lci4;->c:Loh7;

    .line 24
    .line 25
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lci4;->d:Lh76;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    const/4 v1, 0x7

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-static {v2, v1, v0}, Lv77;->b(IILl90;)Lu77;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lci4;->e:Lu77;

    .line 39
    .line 40
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lci4;->f:Lf76;

    .line 45
    .line 46
    return-void
.end method

.method public static f(Lci4;Lgg4;I)V
    .locals 7

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p1, v5

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    and-int/2addr p2, v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    move v4, p2

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move v4, v1

    .line 16
    :goto_0
    sget-object p2, Lmg4;->a:Lmg4;

    .line 17
    .line 18
    iget-object v2, p0, Lci4;->g:Log7;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {v2}, Lrm3;->k()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ne v2, v1, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    iget-object v1, p0, Lci4;->g:Log7;

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1, v5}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 34
    .line 35
    .line 36
    :cond_3
    iget-object v1, p0, Lci4;->h:Ljava/lang/Process;

    .line 37
    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Process;->destroy()V

    .line 41
    .line 42
    .line 43
    :cond_4
    if-nez p1, :cond_6

    .line 44
    .line 45
    iget-object p1, p0, Lci4;->d:Lh76;

    .line 46
    .line 47
    iget-object p1, p1, Lh76;->X:Loh7;

    .line 48
    .line 49
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lng4;

    .line 54
    .line 55
    instance-of v1, p1, Llg4;

    .line 56
    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    check-cast p1, Llg4;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    move-object p1, v5

    .line 63
    :goto_1
    if-eqz p1, :cond_7

    .line 64
    .line 65
    iget-object p1, p1, Llg4;->a:Lgg4;

    .line 66
    .line 67
    :cond_6
    move-object v3, p1

    .line 68
    goto :goto_2

    .line 69
    :cond_7
    move-object v3, v5

    .line 70
    :goto_2
    iget-object p1, p0, Lci4;->c:Loh7;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    :cond_8
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    move-object v2, v1

    .line 80
    check-cast v2, Lng4;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1, p2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_8

    .line 90
    .line 91
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget-object p2, Ltp1;->a:Lnf1;

    .line 96
    .line 97
    sget-object p2, Ldm4;->a:Lhv2;

    .line 98
    .line 99
    new-instance v1, Lqq1;

    .line 100
    .line 101
    const/4 v6, 0x1

    .line 102
    move-object v2, p0

    .line 103
    invoke-direct/range {v1 .. v6}, Lqq1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLq51;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {p1, p2, v1, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    iput-object p0, v2, Lci4;->g:Log7;

    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 0

    .line 1
    iget-object p0, p0, Lci4;->h:Ljava/lang/Process;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Process;->destroy()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final e(Ltg4;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljy2;

    .line 6
    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v3, v2}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {v0, v3, v1, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final g(Lfh4;)V
    .locals 5

    .line 1
    instance-of v0, p1, Lah4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lah4;

    .line 6
    .line 7
    iget-object p1, p1, Lah4;->a:Lgg4;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    invoke-static {p0, p1, v0}, Lci4;->f(Lci4;Lgg4;I)V

    .line 11
    .line 12
    .line 13
    iget-boolean p1, p1, Lgg4;->c:Z

    .line 14
    .line 15
    if-eqz p1, :cond_17

    .line 16
    .line 17
    sget-object p1, Lrg4;->a:Lrg4;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lci4;->e(Ltg4;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    instance-of v0, p1, Ldh4;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    invoke-static {p0, v1, p1}, Lci4;->f(Lci4;Lgg4;I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    instance-of v0, p1, Lxg4;

    .line 34
    .line 35
    iget-object v2, p0, Lci4;->d:Lh76;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object p1, v2, Lh76;->X:Loh7;

    .line 40
    .line 41
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lng4;

    .line 46
    .line 47
    instance-of v0, p1, Llg4;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    move-object v1, p1

    .line 52
    check-cast v1, Llg4;

    .line 53
    .line 54
    :cond_2
    if-eqz v1, :cond_17

    .line 55
    .line 56
    iget-object p1, v1, Llg4;->d:Ljava/lang/String;

    .line 57
    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_3
    new-instance v0, Log4;

    .line 63
    .line 64
    invoke-direct {v0, p1}, Log4;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lci4;->e(Ltg4;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    instance-of v0, p1, Lwg4;

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    invoke-static {p0, v1, v3}, Lci4;->f(Lci4;Lgg4;I)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_5
    instance-of v0, p1, Leh4;

    .line 81
    .line 82
    if-eqz v0, :cond_8

    .line 83
    .line 84
    iget-object p1, v2, Lh76;->X:Loh7;

    .line 85
    .line 86
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lng4;

    .line 91
    .line 92
    instance-of v0, p1, Llg4;

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    move-object v1, p1

    .line 97
    check-cast v1, Llg4;

    .line 98
    .line 99
    :cond_6
    if-eqz v1, :cond_17

    .line 100
    .line 101
    iget-object p1, v1, Llg4;->a:Lgg4;

    .line 102
    .line 103
    if-eqz p1, :cond_17

    .line 104
    .line 105
    iget-object p1, p1, Lgg4;->a:Ljava/lang/String;

    .line 106
    .line 107
    if-nez p1, :cond_7

    .line 108
    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :cond_7
    new-instance v0, Lqg4;

    .line 112
    .line 113
    invoke-direct {v0, p1}, Lqg4;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lci4;->e(Ltg4;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_8
    instance-of v0, p1, Lch4;

    .line 121
    .line 122
    iget-object p0, p0, Lci4;->c:Loh7;

    .line 123
    .line 124
    const/4 v1, 0x0

    .line 125
    if-eqz v0, :cond_c

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    :cond_9
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    move-object v0, p1

    .line 135
    check-cast v0, Lng4;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    instance-of v2, v0, Llg4;

    .line 141
    .line 142
    if-eqz v2, :cond_a

    .line 143
    .line 144
    check-cast v0, Llg4;

    .line 145
    .line 146
    iget v2, v0, Llg4;->c:I

    .line 147
    .line 148
    sub-int/2addr v2, v3

    .line 149
    iget v4, v0, Llg4;->f:I

    .line 150
    .line 151
    sub-int/2addr v4, v3

    .line 152
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    invoke-static {v2, v1, v4}, Lx97;->n(III)I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    invoke-static {v0, v2}, Llg4;->a(Llg4;I)Llg4;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    goto :goto_0

    .line 165
    :cond_a
    instance-of v2, v0, Lmg4;

    .line 166
    .line 167
    if-eqz v2, :cond_b

    .line 168
    .line 169
    :goto_0
    invoke-virtual {p0, p1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_9

    .line 174
    .line 175
    return-void

    .line 176
    :cond_b
    invoke-static {}, Lb61;->c()V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_c
    instance-of v0, p1, Lyg4;

    .line 181
    .line 182
    if-eqz v0, :cond_10

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    :cond_d
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    move-object v0, p1

    .line 192
    check-cast v0, Lng4;

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    instance-of v2, v0, Llg4;

    .line 198
    .line 199
    if-eqz v2, :cond_e

    .line 200
    .line 201
    check-cast v0, Llg4;

    .line 202
    .line 203
    iget v2, v0, Llg4;->f:I

    .line 204
    .line 205
    sub-int/2addr v2, v3

    .line 206
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    invoke-static {v1, v1, v2}, Lx97;->n(III)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    invoke-static {v0, v2}, Llg4;->a(Llg4;I)Llg4;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    goto :goto_1

    .line 219
    :cond_e
    instance-of v2, v0, Lmg4;

    .line 220
    .line 221
    if-eqz v2, :cond_f

    .line 222
    .line 223
    :goto_1
    invoke-virtual {p0, p1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-eqz p1, :cond_d

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_f
    invoke-static {}, Lb61;->c()V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :cond_10
    instance-of v0, p1, Lbh4;

    .line 235
    .line 236
    if-eqz v0, :cond_14

    .line 237
    .line 238
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    :cond_11
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    move-object v0, p1

    .line 246
    check-cast v0, Lng4;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    instance-of v2, v0, Llg4;

    .line 252
    .line 253
    if-eqz v2, :cond_12

    .line 254
    .line 255
    check-cast v0, Llg4;

    .line 256
    .line 257
    iget v2, v0, Llg4;->c:I

    .line 258
    .line 259
    add-int/2addr v2, v3

    .line 260
    iget v4, v0, Llg4;->f:I

    .line 261
    .line 262
    sub-int/2addr v4, v3

    .line 263
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    invoke-static {v2, v1, v4}, Lx97;->n(III)I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    invoke-static {v0, v2}, Llg4;->a(Llg4;I)Llg4;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    goto :goto_2

    .line 276
    :cond_12
    instance-of v2, v0, Lmg4;

    .line 277
    .line 278
    if-eqz v2, :cond_13

    .line 279
    .line 280
    :goto_2
    invoke-virtual {p0, p1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    if-eqz p1, :cond_11

    .line 285
    .line 286
    return-void

    .line 287
    :cond_13
    invoke-static {}, Lb61;->c()V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :cond_14
    instance-of p1, p1, Lzg4;

    .line 292
    .line 293
    if-eqz p1, :cond_19

    .line 294
    .line 295
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    :cond_15
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    move-object v0, p1

    .line 303
    check-cast v0, Lng4;

    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    instance-of v2, v0, Llg4;

    .line 309
    .line 310
    if-eqz v2, :cond_16

    .line 311
    .line 312
    check-cast v0, Llg4;

    .line 313
    .line 314
    iget v2, v0, Llg4;->f:I

    .line 315
    .line 316
    sub-int/2addr v2, v3

    .line 317
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    invoke-static {v2, v1, v4}, Lx97;->n(III)I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    invoke-static {v0, v2}, Llg4;->a(Llg4;I)Llg4;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    goto :goto_3

    .line 330
    :cond_16
    instance-of v2, v0, Lmg4;

    .line 331
    .line 332
    if-eqz v2, :cond_18

    .line 333
    .line 334
    :goto_3
    invoke-virtual {p0, p1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    if-eqz p1, :cond_15

    .line 339
    .line 340
    :cond_17
    :goto_4
    return-void

    .line 341
    :cond_18
    invoke-static {}, Lb61;->c()V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :cond_19
    invoke-static {}, Lb61;->c()V

    .line 346
    .line 347
    .line 348
    return-void
.end method

.method public final h(ZLs51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Lbi4;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lbi4;

    .line 13
    .line 14
    iget v4, v3, Lbi4;->i0:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lbi4;->i0:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lbi4;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lbi4;-><init>(Lci4;Ls51;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Ls51;->Y:Ls61;

    .line 32
    .line 33
    iget-object v4, v3, Lbi4;->g0:Ljava/lang/Object;

    .line 34
    .line 35
    iget v5, v3, Lbi4;->i0:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    sget-object v10, Lc71;->X:Lc71;

    .line 42
    .line 43
    if-eqz v5, :cond_3

    .line 44
    .line 45
    if-eq v5, v9, :cond_2

    .line 46
    .line 47
    if-ne v5, v8, :cond_1

    .line 48
    .line 49
    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v7

    .line 59
    :cond_2
    iget-boolean v1, v3, Lbi4;->f0:Z

    .line 60
    .line 61
    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    const-string v4, "-c"

    .line 71
    .line 72
    filled-new-array {v4}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object v5, Ltp1;->a:Lnf1;

    .line 80
    .line 81
    sget-object v5, Lye1;->Z:Lye1;

    .line 82
    .line 83
    new-instance v11, Lai4;

    .line 84
    .line 85
    invoke-direct {v11, v4, v0, v2, v6}, Lai4;-><init>([Ljava/lang/String;Lci4;Ls61;B)V

    .line 86
    .line 87
    .line 88
    iput-boolean v1, v3, Lbi4;->f0:Z

    .line 89
    .line 90
    iput v9, v3, Lbi4;->i0:I

    .line 91
    .line 92
    new-instance v4, Lpg3;

    .line 93
    .line 94
    invoke-direct {v4, v11, v7, v6}, Lpg3;-><init>(Ldn2;Lq51;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {v5, v4, v3}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-ne v4, v10, :cond_4

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    :goto_1
    iget-object v4, v0, Lci4;->b:Lvz7;

    .line 105
    .line 106
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Lcom/tencent/mmkv/MMKV;

    .line 111
    .line 112
    const-string v11, "pref_logs_type"

    .line 113
    .line 114
    const/4 v12, -0x1

    .line 115
    invoke-virtual {v5, v12, v11}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    sget-object v11, Le69;->Z:Lf08;

    .line 120
    .line 121
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {v5}, Lf08;->i(I)Le69;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    iget-object v5, v5, Le69;->Y:Ljava/lang/String;

    .line 129
    .line 130
    if-nez v5, :cond_5

    .line 131
    .line 132
    const-string v0, ""

    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_5
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    check-cast v4, Lcom/tencent/mmkv/MMKV;

    .line 140
    .line 141
    const-string v11, "pref_logs_output_type"

    .line 142
    .line 143
    invoke-virtual {v4, v12, v11}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    sget-object v11, Lnf4;->Y:Lk32;

    .line 148
    .line 149
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    sget-object v11, Lnf4;->g0:Ln22;

    .line 153
    .line 154
    invoke-static {v4, v11}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, Lnf4;

    .line 159
    .line 160
    if-nez v4, :cond_6

    .line 161
    .line 162
    sget-object v4, Lnf4;->Z:Lnf4;

    .line 163
    .line 164
    :cond_6
    iget-object v13, v4, Lnf4;->X:Ljava/lang/String;

    .line 165
    .line 166
    const-string v4, "GoLog:"

    .line 167
    .line 168
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v14

    .line 172
    const-string v4, "tun2socks:"

    .line 173
    .line 174
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    const-string v16, "*:S"

    .line 179
    .line 180
    const-string v11, "-d"

    .line 181
    .line 182
    const-string v12, "-v"

    .line 183
    .line 184
    filled-new-array/range {v11 .. v16}, [Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    sget-object v5, Ltp1;->a:Lnf1;

    .line 192
    .line 193
    sget-object v5, Lye1;->Z:Lye1;

    .line 194
    .line 195
    new-instance v11, Lai4;

    .line 196
    .line 197
    invoke-direct {v11, v4, v0, v2, v9}, Lai4;-><init>([Ljava/lang/String;Lci4;Ls61;B)V

    .line 198
    .line 199
    .line 200
    iput-boolean v1, v3, Lbi4;->f0:Z

    .line 201
    .line 202
    iput v8, v3, Lbi4;->i0:I

    .line 203
    .line 204
    new-instance v0, Lpg3;

    .line 205
    .line 206
    invoke-direct {v0, v11, v7, v6}, Lpg3;-><init>(Ldn2;Lq51;B)V

    .line 207
    .line 208
    .line 209
    invoke-static {v5, v0, v3}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-ne v0, v10, :cond_7

    .line 214
    .line 215
    :goto_2
    return-object v10

    .line 216
    :cond_7
    return-object v0
.end method
