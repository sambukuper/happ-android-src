.class public final Lo35;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw82;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lpd5;

.field public final c:Lvz7;

.field public final d:Lvz7;

.field public final e:Lvz7;

.field public final f:Lqc3;

.field public final g:Lvz7;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpd5;Lvz7;Lvz7;Lvz7;Lqc3;Lvz7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo35;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lo35;->b:Lpd5;

    .line 7
    .line 8
    iput-object p3, p0, Lo35;->c:Lvz7;

    .line 9
    .line 10
    iput-object p4, p0, Lo35;->d:Lvz7;

    .line 11
    .line 12
    iput-object p5, p0, Lo35;->e:Lvz7;

    .line 13
    .line 14
    iput-object p6, p0, Lo35;->f:Lqc3;

    .line 15
    .line 16
    iput-object p7, p0, Lo35;->g:Lvz7;

    .line 17
    .line 18
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const-string v1, "text/plain"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p1, v2, v1}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    :cond_0
    invoke-static {p0}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    :goto_0
    move-object v1, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/16 v1, 0x23

    .line 22
    .line 23
    invoke-static {v1, p0}, Lfm7;->O0(CLjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/16 v1, 0x3f

    .line 28
    .line 29
    invoke-static {v1, p0}, Lfm7;->O0(CLjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/16 v1, 0x2f

    .line 34
    .line 35
    invoke-static {v1, p0, p0}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const/16 v1, 0x2e

    .line 40
    .line 41
    const-string v2, ""

    .line 42
    .line 43
    invoke-static {v1, p0, v2}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v1, Lrv4;->a:Lip4;

    .line 64
    .line 65
    invoke-virtual {v1, p0}, Lip4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/String;

    .line 70
    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1, p0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_4
    if-eqz p1, :cond_5

    .line 85
    .line 86
    const/16 p0, 0x3b

    .line 87
    .line 88
    invoke-static {p0, p1}, Lfm7;->M0(CLjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_5
    return-object v0
.end method

.method public static f(Lw35;)V
    .locals 2

    .line 1
    iget p0, p0, Lw35;->a:I

    .line 2
    .line 3
    const/16 v0, 0xc8

    .line 4
    .line 5
    if-gt v0, p0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x12c

    .line 8
    .line 9
    if-ge p0, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v0, 0x130

    .line 13
    .line 14
    if-ne p0, v0, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    new-instance v0, Lr23;

    .line 18
    .line 19
    const-string v1, "HTTP "

    .line 20
    .line 21
    invoke-static {p0, v1}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method


# virtual methods
.method public final a(Ll12;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lo35;->g:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lwl8;

    .line 8
    .line 9
    iget-object v1, p0, Lo35;->b:Lpd5;

    .line 10
    .line 11
    iget-object v1, v1, Lpd5;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v2, Ld0;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/16 v9, 0x19

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    const-class v5, Lo35;

    .line 20
    .line 21
    const-string v6, "doFetch"

    .line 22
    .line 23
    const-string v7, "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 24
    .line 25
    move-object v4, p0

    .line 26
    invoke-direct/range {v2 .. v9}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p1}, Ld0;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final b(Lq51;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v1, v0, Ll35;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Ll35;

    .line 11
    .line 12
    iget v3, v1, Ll35;->j0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v1, Ll35;->j0:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Ll35;

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Ll35;-><init>(Lo35;Lq51;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v6, Ll35;->h0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v1, v6, Ll35;->j0:I

    .line 34
    .line 35
    sget-object v3, Lma1;->Z:Lma1;

    .line 36
    .line 37
    iget-object v7, v2, Lo35;->c:Lvz7;

    .line 38
    .line 39
    iget-object v4, v2, Lo35;->a:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v5, v2, Lo35;->b:Lpd5;

    .line 42
    .line 43
    const/4 v8, 0x3

    .line 44
    const/4 v9, 0x2

    .line 45
    const/4 v10, 0x1

    .line 46
    const/4 v11, 0x0

    .line 47
    sget-object v12, Lc71;->X:Lc71;

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    if-eq v1, v10, :cond_3

    .line 52
    .line 53
    if-eq v1, v9, :cond_2

    .line 54
    .line 55
    if-ne v1, v8, :cond_1

    .line 56
    .line 57
    iget-object v1, v6, Ll35;->g0:Lea6;

    .line 58
    .line 59
    check-cast v1, Llc0;

    .line 60
    .line 61
    iget-object v1, v6, Ll35;->f0:Lea6;

    .line 62
    .line 63
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :catch_0
    move-exception v0

    .line 69
    goto/16 :goto_a

    .line 70
    .line 71
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object v11

    .line 77
    :cond_2
    iget-object v1, v6, Ll35;->g0:Lea6;

    .line 78
    .line 79
    check-cast v1, Llc0;

    .line 80
    .line 81
    iget-object v1, v6, Ll35;->f0:Lea6;

    .line 82
    .line 83
    :try_start_1
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 84
    .line 85
    .line 86
    goto/16 :goto_7

    .line 87
    .line 88
    :cond_3
    iget-object v1, v6, Ll35;->g0:Lea6;

    .line 89
    .line 90
    iget-object v10, v6, Ll35;->f0:Lea6;

    .line 91
    .line 92
    :try_start_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 93
    .line 94
    .line 95
    move-object/from16 v17, v10

    .line 96
    .line 97
    move-object v10, v1

    .line 98
    move-object/from16 v1, v17

    .line 99
    .line 100
    goto/16 :goto_4

    .line 101
    .line 102
    :catch_1
    move-exception v0

    .line 103
    move-object v1, v10

    .line 104
    goto/16 :goto_a

    .line 105
    .line 106
    :cond_4
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    new-instance v1, Lea6;

    .line 110
    .line 111
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    iget-object v0, v5, Lpd5;->h:Lkc0;

    .line 115
    .line 116
    iget-boolean v0, v0, Lkc0;->X:Z

    .line 117
    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    iget-object v0, v2, Lo35;->d:Lvz7;

    .line 121
    .line 122
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Lr76;

    .line 127
    .line 128
    if-eqz v0, :cond_6

    .line 129
    .line 130
    iget-object v13, v5, Lpd5;->e:Ljava/lang/String;

    .line 131
    .line 132
    if-nez v13, :cond_5

    .line 133
    .line 134
    move-object v13, v4

    .line 135
    :cond_5
    iget-object v0, v0, Lr76;->b:Llp1;

    .line 136
    .line 137
    sget-object v14, Lkb0;->f0:Lkb0;

    .line 138
    .line 139
    invoke-static {v13}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    const-string v14, "SHA-256"

    .line 144
    .line 145
    invoke-virtual {v13, v14}, Lkb0;->d(Ljava/lang/String;)Lkb0;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    invoke-virtual {v13}, Lkb0;->f()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    invoke-virtual {v0, v13}, Llp1;->m(Ljava/lang/String;)Ljp1;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-eqz v0, :cond_6

    .line 158
    .line 159
    new-instance v13, Lq76;

    .line 160
    .line 161
    invoke-direct {v13, v0}, Lq76;-><init>(Ljp1;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_6
    move-object v13, v11

    .line 166
    :goto_2
    iput-object v13, v1, Lea6;->X:Ljava/lang/Object;

    .line 167
    .line 168
    :try_start_3
    new-instance v0, Lea6;

    .line 169
    .line 170
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    if-eqz v13, :cond_c

    .line 174
    .line 175
    invoke-virtual {v2}, Lo35;->c()Ls92;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    iget-object v14, v1, Lea6;->X:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v14, Lq76;

    .line 182
    .line 183
    iget-object v14, v14, Lq76;->X:Ljp1;

    .line 184
    .line 185
    iget-boolean v15, v14, Ljp1;->Y:Z

    .line 186
    .line 187
    if-nez v15, :cond_b

    .line 188
    .line 189
    iget-object v14, v14, Ljp1;->X:Lip1;

    .line 190
    .line 191
    iget-object v14, v14, Lip1;->c:Ljava/util/ArrayList;

    .line 192
    .line 193
    const/4 v15, 0x0

    .line 194
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v14

    .line 198
    check-cast v14, Loi5;

    .line 199
    .line 200
    invoke-virtual {v13, v14}, Ls92;->metadata(Loi5;)Li92;

    .line 201
    .line 202
    .line 203
    move-result-object v13

    .line 204
    iget-object v13, v13, Li92;->d:Ljava/lang/Long;

    .line 205
    .line 206
    if-nez v13, :cond_7

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_7
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 210
    .line 211
    .line 212
    move-result-wide v13

    .line 213
    const-wide/16 v15, 0x0

    .line 214
    .line 215
    cmp-long v13, v13, v15

    .line 216
    .line 217
    if-nez v13, :cond_8

    .line 218
    .line 219
    new-instance v0, Lle7;

    .line 220
    .line 221
    iget-object v5, v1, Lea6;->X:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v5, Lq76;

    .line 224
    .line 225
    invoke-virtual {v2, v5}, Lo35;->g(Lq76;)Lh92;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-static {v4, v11}, Lo35;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-direct {v0, v2, v4, v3}, Lle7;-><init>(Ld73;Ljava/lang/String;Lma1;)V

    .line 234
    .line 235
    .line 236
    return-object v0

    .line 237
    :cond_8
    :goto_3
    iget-object v13, v1, Lea6;->X:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v13, Lq76;

    .line 240
    .line 241
    invoke-virtual {v2, v13}, Lo35;->i(Lq76;)Lw35;

    .line 242
    .line 243
    .line 244
    move-result-object v13

    .line 245
    iput-object v13, v0, Lea6;->X:Ljava/lang/Object;

    .line 246
    .line 247
    if-eqz v13, :cond_c

    .line 248
    .line 249
    iget-object v13, v2, Lo35;->e:Lvz7;

    .line 250
    .line 251
    invoke-virtual {v13}, Lvz7;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    check-cast v13, Lnc0;

    .line 256
    .line 257
    iget-object v14, v0, Lea6;->X:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v14, Lw35;

    .line 260
    .line 261
    invoke-virtual {v2}, Lo35;->e()Lt35;

    .line 262
    .line 263
    .line 264
    iput-object v1, v6, Ll35;->f0:Lea6;

    .line 265
    .line 266
    iput-object v0, v6, Ll35;->g0:Lea6;

    .line 267
    .line 268
    iput v10, v6, Ll35;->j0:I

    .line 269
    .line 270
    check-cast v13, Lfe1;

    .line 271
    .line 272
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    new-instance v10, Llc0;

    .line 276
    .line 277
    invoke-direct {v10, v14}, Llc0;-><init>(Lw35;)V

    .line 278
    .line 279
    .line 280
    if-ne v10, v12, :cond_9

    .line 281
    .line 282
    goto/16 :goto_8

    .line 283
    .line 284
    :cond_9
    move-object/from16 v17, v10

    .line 285
    .line 286
    move-object v10, v0

    .line 287
    move-object/from16 v0, v17

    .line 288
    .line 289
    :goto_4
    check-cast v0, Llc0;

    .line 290
    .line 291
    iget-object v13, v0, Llc0;->a:Lw35;

    .line 292
    .line 293
    if-eqz v13, :cond_a

    .line 294
    .line 295
    invoke-static {v13}, Lo35;->f(Lw35;)V

    .line 296
    .line 297
    .line 298
    new-instance v5, Lle7;

    .line 299
    .line 300
    iget-object v6, v1, Lea6;->X:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v6, Lq76;

    .line 303
    .line 304
    invoke-virtual {v2, v6}, Lo35;->g(Lq76;)Lh92;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    iget-object v0, v0, Llc0;->a:Lw35;

    .line 309
    .line 310
    iget-object v0, v0, Lw35;->d:Lq35;

    .line 311
    .line 312
    invoke-virtual {v0}, Lq35;->a()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v4, v0}, Lo35;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-direct {v5, v2, v0, v3}, Lle7;-><init>(Ld73;Ljava/lang/String;Lma1;)V

    .line 321
    .line 322
    .line 323
    return-object v5

    .line 324
    :cond_a
    move-object v3, v10

    .line 325
    goto :goto_5

    .line 326
    :cond_b
    const-string v0, "snapshot is closed"

    .line 327
    .line 328
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 329
    .line 330
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw v2

    .line 334
    :cond_c
    move-object v3, v0

    .line 335
    :goto_5
    iget-object v0, v5, Lpd5;->i:Lkc0;

    .line 336
    .line 337
    iget-boolean v0, v0, Lkc0;->X:Z

    .line 338
    .line 339
    if-eqz v0, :cond_e

    .line 340
    .line 341
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-static {v0, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    if-nez v0, :cond_d

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_d
    new-instance v0, Landroid/os/NetworkOnMainThreadException;

    .line 357
    .line 358
    invoke-direct {v0}, Landroid/os/NetworkOnMainThreadException;-><init>()V

    .line 359
    .line 360
    .line 361
    throw v0

    .line 362
    :cond_e
    :goto_6
    invoke-virtual {v2}, Lo35;->e()Lt35;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    invoke-virtual {v7}, Lvz7;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    move-object v10, v0

    .line 371
    check-cast v10, Lf35;

    .line 372
    .line 373
    new-instance v0, Lia1;

    .line 374
    .line 375
    const/4 v5, 0x0

    .line 376
    invoke-direct/range {v0 .. v5}, Lia1;-><init>(Lea6;Lo35;Lea6;Lt35;Lq51;)V

    .line 377
    .line 378
    .line 379
    iput-object v1, v6, Ll35;->f0:Lea6;

    .line 380
    .line 381
    iput-object v11, v6, Ll35;->g0:Lea6;

    .line 382
    .line 383
    iput v9, v6, Ll35;->j0:I

    .line 384
    .line 385
    check-cast v10, Lgd0;

    .line 386
    .line 387
    iget-object v3, v10, Lgd0;->a:Lokhttp3/OkHttpClient;

    .line 388
    .line 389
    invoke-static {v3, v4, v0, v6}, Lgd0;->a(Lokhttp3/OkHttpClient;Lt35;Lrn2;Ls51;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    if-ne v0, v12, :cond_f

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_f
    :goto_7
    check-cast v0, Lle7;

    .line 397
    .line 398
    if-nez v0, :cond_11

    .line 399
    .line 400
    invoke-virtual {v7}, Lvz7;->getValue()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    check-cast v0, Lf35;

    .line 405
    .line 406
    invoke-virtual {v2}, Lo35;->e()Lt35;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    new-instance v4, Ljy2;

    .line 411
    .line 412
    const/16 v5, 0xd

    .line 413
    .line 414
    invoke-direct {v4, v2, v11, v5}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 415
    .line 416
    .line 417
    iput-object v1, v6, Ll35;->f0:Lea6;

    .line 418
    .line 419
    iput-object v11, v6, Ll35;->g0:Lea6;

    .line 420
    .line 421
    iput v8, v6, Ll35;->j0:I

    .line 422
    .line 423
    check-cast v0, Lgd0;

    .line 424
    .line 425
    iget-object v0, v0, Lgd0;->a:Lokhttp3/OkHttpClient;

    .line 426
    .line 427
    invoke-static {v0, v3, v4, v6}, Lgd0;->a(Lokhttp3/OkHttpClient;Lt35;Lrn2;Ls51;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    if-ne v0, v12, :cond_10

    .line 432
    .line 433
    :goto_8
    return-object v12

    .line 434
    :cond_10
    :goto_9
    check-cast v0, Lle7;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 435
    .line 436
    :cond_11
    return-object v0

    .line 437
    :goto_a
    iget-object v1, v1, Lea6;->X:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v1, Lq76;

    .line 440
    .line 441
    if-eqz v1, :cond_12

    .line 442
    .line 443
    :try_start_4
    invoke-static {v1}, Lpc6;->w(Ljava/lang/AutoCloseable;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 444
    .line 445
    .line 446
    goto :goto_b

    .line 447
    :catch_2
    move-exception v0

    .line 448
    throw v0

    .line 449
    :catch_3
    :cond_12
    :goto_b
    throw v0
.end method

.method public final c()Ls92;
    .locals 1

    .line 1
    iget-object v0, p0, Lo35;->d:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr76;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, Lr76;->a:Ls92;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    iget-object p0, p0, Lo35;->b:Lpd5;

    .line 18
    .line 19
    iget-object p0, p0, Lpd5;->f:Ls92;

    .line 20
    .line 21
    return-object p0
.end method

.method public final e()Lt35;
    .locals 5

    .line 1
    sget-object v0, Lx63;->b:Lf4;

    .line 2
    .line 3
    iget-object v1, p0, Lo35;->b:Lpd5;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lq35;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v2, Lt91;

    .line 15
    .line 16
    invoke-direct {v2, v0}, Lt91;-><init>(Lq35;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Lpd5;->h:Lkc0;

    .line 20
    .line 21
    iget-boolean v3, v0, Lkc0;->X:Z

    .line 22
    .line 23
    iget-object v4, v1, Lpd5;->i:Lkc0;

    .line 24
    .line 25
    iget-boolean v4, v4, Lkc0;->X:Z

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    iget-object v4, p0, Lo35;->f:Lqc3;

    .line 30
    .line 31
    iget-object v4, v4, Lqc3;->X:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Lg21;

    .line 34
    .line 35
    invoke-interface {v4}, Lg21;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v4, 0x0

    .line 44
    :goto_0
    if-nez v4, :cond_1

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    const-string v0, "only-if-cached, max-stale=2147483647"

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Lt91;->c(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    if-eqz v4, :cond_3

    .line 55
    .line 56
    if-nez v3, :cond_3

    .line 57
    .line 58
    iget-boolean v0, v0, Lkc0;->Y:Z

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    const-string v0, "no-cache"

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Lt91;->c(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const-string v0, "no-cache, no-store"

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Lt91;->c(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    if-nez v4, :cond_4

    .line 75
    .line 76
    if-nez v3, :cond_4

    .line 77
    .line 78
    const-string v0, "no-cache, only-if-cached"

    .line 79
    .line 80
    invoke-virtual {v2, v0}, Lt91;->c(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_1
    new-instance v0, Lt35;

    .line 84
    .line 85
    sget-object v3, Lx63;->a:Lf4;

    .line 86
    .line 87
    invoke-static {v1, v3}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/lang/String;

    .line 92
    .line 93
    new-instance v4, Lq35;

    .line 94
    .line 95
    iget-object v2, v2, Lt91;->a:Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    invoke-static {v2}, Lzp4;->Q(Ljava/util/Map;)Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-direct {v4, v2}, Lq35;-><init>(Ljava/util/Map;)V

    .line 102
    .line 103
    .line 104
    sget-object v2, Lx63;->c:Lf4;

    .line 105
    .line 106
    invoke-static {v1, v2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-nez v2, :cond_5

    .line 111
    .line 112
    iget-object v1, v1, Lpd5;->j:Ls72;

    .line 113
    .line 114
    iget-object p0, p0, Lo35;->a:Ljava/lang/String;

    .line 115
    .line 116
    invoke-direct {v0, p0, v3, v4, v1}, Lt35;-><init>(Ljava/lang/String;Ljava/lang/String;Lq35;Ls72;)V

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_5
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 121
    .line 122
    .line 123
    const/4 p0, 0x0

    .line 124
    return-object p0
.end method

.method public final g(Lq76;)Lh92;
    .locals 3

    .line 1
    iget-object v0, p1, Lq76;->X:Ljp1;

    .line 2
    .line 3
    iget-boolean v1, v0, Ljp1;->Y:Z

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Ljp1;->X:Lip1;

    .line 8
    .line 9
    iget-object v0, v0, Lip1;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Loi5;

    .line 17
    .line 18
    invoke-virtual {p0}, Lo35;->c()Ls92;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lo35;->b:Lpd5;

    .line 23
    .line 24
    iget-object v2, v2, Lpd5;->e:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lo35;->a:Ljava/lang/String;

    .line 29
    .line 30
    :cond_0
    const/16 p0, 0x10

    .line 31
    .line 32
    invoke-static {v0, v1, v2, p1, p0}, Lvj8;->i(Loi5;Ls92;Ljava/lang/String;Lq76;I)Lh92;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    const-string p0, "snapshot is closed"

    .line 38
    .line 39
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public final h(Lpe7;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lm35;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lm35;

    .line 7
    .line 8
    iget v1, v0, Lm35;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lm35;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm35;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lm35;-><init>(Lo35;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lm35;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm35;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Lm35;->f0:Li90;

    .line 35
    .line 36
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p2, Li90;

    .line 51
    .line 52
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p2, v0, Lm35;->f0:Li90;

    .line 56
    .line 57
    iput v2, v0, Lm35;->i0:I

    .line 58
    .line 59
    iget-object p1, p1, Lpe7;->X:Lba0;

    .line 60
    .line 61
    invoke-interface {p1, p2}, Lba0;->Z(Laa0;)J

    .line 62
    .line 63
    .line 64
    sget-object p1, Ldn8;->a:Ldn8;

    .line 65
    .line 66
    sget-object v0, Lc71;->X:Lc71;

    .line 67
    .line 68
    if-ne p1, v0, :cond_3

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_3
    move-object p1, p2

    .line 72
    :goto_1
    invoke-virtual {p0}, Lo35;->c()Ls92;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p1, p0}, Lvj8;->j(Lba0;Ls92;)Lme7;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method

.method public final i(Lq76;)Lw35;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lo35;->c()Ls92;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-object p1, p1, Lq76;->X:Ljp1;

    .line 7
    .line 8
    iget-boolean v1, p1, Ljp1;->Y:Z

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object p1, p1, Ljp1;->X:Lip1;

    .line 13
    .line 14
    iget-object p1, p1, Lip1;->c:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Loi5;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ls92;->source(Loi5;)Lje7;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lvr3;->i(Lje7;)Lj76;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :try_start_1
    invoke-static {p0}, Lnr4;->K(Lj76;)Lw35;

    .line 32
    .line 33
    .line 34
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    :try_start_2
    invoke-virtual {p0}, Lj76;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    .line 37
    .line 38
    move-object p0, v0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception p1

    .line 43
    :try_start_3
    invoke-virtual {p0}, Lj76;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_2
    move-exception p0

    .line 48
    :try_start_4
    invoke-static {p1, p0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    move-object p0, p1

    .line 52
    move-object p1, v0

    .line 53
    :goto_1
    if-nez p0, :cond_0

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_0
    throw p0

    .line 57
    :cond_1
    const-string p0, "snapshot is closed"

    .line 58
    .line 59
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 65
    :catch_0
    return-object v0
.end method

.method public final j(Lq76;Lw35;Lw35;Ls51;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    instance-of v5, v4, Ln35;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v4

    .line 16
    check-cast v5, Ln35;

    .line 17
    .line 18
    iget v6, v5, Ln35;->l0:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v6, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v7

    .line 27
    iput v6, v5, Ln35;->l0:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v5, Ln35;

    .line 31
    .line 32
    invoke-direct {v5, v1, v4}, Ln35;-><init>(Lo35;Ls51;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v4, v5, Ln35;->j0:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v6, Lc71;->X:Lc71;

    .line 38
    .line 39
    iget v7, v5, Ln35;->l0:I

    .line 40
    .line 41
    const/4 v8, 0x2

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x1

    .line 44
    const/4 v11, 0x0

    .line 45
    if-eqz v7, :cond_3

    .line 46
    .line 47
    if-eq v7, v10, :cond_2

    .line 48
    .line 49
    if-ne v7, v8, :cond_1

    .line 50
    .line 51
    iget-object v1, v5, Ln35;->i0:Ly45;

    .line 52
    .line 53
    iget-object v2, v5, Ln35;->h0:Lw35;

    .line 54
    .line 55
    iget-object v3, v5, Ln35;->g0:Lw35;

    .line 56
    .line 57
    :try_start_0
    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_10

    .line 61
    .line 62
    :catch_0
    move-exception v0

    .line 63
    goto/16 :goto_13

    .line 64
    .line 65
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v11

    .line 71
    :cond_2
    iget-object v0, v5, Ln35;->g0:Lw35;

    .line 72
    .line 73
    iget-object v2, v5, Ln35;->f0:Lq76;

    .line 74
    .line 75
    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v3, v0

    .line 79
    move-object v0, v2

    .line 80
    move-object/from16 p4, v11

    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_3
    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v4, v1, Lo35;->b:Lpd5;

    .line 88
    .line 89
    iget-object v4, v4, Lpd5;->h:Lkc0;

    .line 90
    .line 91
    iget-boolean v4, v4, Lkc0;->Y:Z

    .line 92
    .line 93
    if-nez v4, :cond_5

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    :try_start_1
    invoke-static {v0}, Lpc6;->w(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 98
    .line 99
    .line 100
    :catch_1
    :cond_4
    move-object/from16 p4, v11

    .line 101
    .line 102
    goto/16 :goto_8

    .line 103
    .line 104
    :catch_2
    move-exception v0

    .line 105
    throw v0

    .line 106
    :cond_5
    iget-object v4, v1, Lo35;->e:Lvz7;

    .line 107
    .line 108
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, Lnc0;

    .line 113
    .line 114
    iput-object v0, v5, Ln35;->f0:Lq76;

    .line 115
    .line 116
    iput-object v3, v5, Ln35;->g0:Lw35;

    .line 117
    .line 118
    iput v10, v5, Ln35;->l0:I

    .line 119
    .line 120
    check-cast v4, Lfe1;

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget v4, v3, Lw35;->a:I

    .line 126
    .line 127
    const/16 v7, 0x130

    .line 128
    .line 129
    if-ne v4, v7, :cond_8

    .line 130
    .line 131
    if-eqz v2, :cond_8

    .line 132
    .line 133
    iget-object v2, v2, Lw35;->d:Lq35;

    .line 134
    .line 135
    iget-object v4, v3, Lw35;->d:Lq35;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v2, v2, Lq35;->a:Ljava/util/Map;

    .line 141
    .line 142
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 143
    .line 144
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Ljava/lang/Iterable;

    .line 152
    .line 153
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    if-eqz v12, :cond_6

    .line 162
    .line 163
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    check-cast v12, Ljava/util/Map$Entry;

    .line 168
    .line 169
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    check-cast v12, Ljava/util/Collection;

    .line 178
    .line 179
    invoke-static {v12}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-interface {v7, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_6
    iget-object v2, v4, Lq35;->a:Ljava/util/Map;

    .line 188
    .line 189
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    if-eqz v4, :cond_7

    .line 202
    .line 203
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    check-cast v4, Ljava/util/Map$Entry;

    .line 208
    .line 209
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    check-cast v12, Ljava/lang/String;

    .line 214
    .line 215
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    check-cast v4, Ljava/util/List;

    .line 220
    .line 221
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 222
    .line 223
    invoke-virtual {v12, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-static {v4}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-interface {v7, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_7
    new-instance v2, Lq35;

    .line 239
    .line 240
    invoke-static {v7}, Lzp4;->Q(Ljava/util/Map;)Ljava/util/Map;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-direct {v2, v4}, Lq35;-><init>(Ljava/util/Map;)V

    .line 245
    .line 246
    .line 247
    new-instance v4, Lmc0;

    .line 248
    .line 249
    iget v14, v3, Lw35;->a:I

    .line 250
    .line 251
    iget-wide v12, v3, Lw35;->b:J

    .line 252
    .line 253
    move-object/from16 p4, v11

    .line 254
    .line 255
    move-wide v15, v12

    .line 256
    iget-wide v11, v3, Lw35;->c:J

    .line 257
    .line 258
    iget-object v7, v3, Lw35;->f:Ljava/lang/Object;

    .line 259
    .line 260
    new-instance v13, Lw35;

    .line 261
    .line 262
    const/16 v20, 0x0

    .line 263
    .line 264
    move-object/from16 v19, v2

    .line 265
    .line 266
    move-object/from16 v21, v7

    .line 267
    .line 268
    move-wide/from16 v17, v11

    .line 269
    .line 270
    invoke-direct/range {v13 .. v21}, Lw35;-><init>(IJJLq35;Lpe7;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-direct {v4, v13}, Lmc0;-><init>(Lw35;)V

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_8
    move-object/from16 p4, v11

    .line 278
    .line 279
    const/16 v2, 0xc8

    .line 280
    .line 281
    if-gt v2, v4, :cond_9

    .line 282
    .line 283
    const/16 v2, 0x12c

    .line 284
    .line 285
    if-ge v4, v2, :cond_9

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_9
    sget-object v2, Lfe1;->b:Ljava/util/Set;

    .line 289
    .line 290
    new-instance v7, Ljava/lang/Integer;

    .line 291
    .line 292
    invoke-direct {v7, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v2, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-eqz v2, :cond_a

    .line 300
    .line 301
    :goto_3
    new-instance v2, Lmc0;

    .line 302
    .line 303
    invoke-direct {v2, v3}, Lmc0;-><init>(Lw35;)V

    .line 304
    .line 305
    .line 306
    :goto_4
    move-object v4, v2

    .line 307
    goto :goto_5

    .line 308
    :cond_a
    sget-object v2, Lmc0;->b:Lmc0;

    .line 309
    .line 310
    goto :goto_4

    .line 311
    :goto_5
    if-ne v4, v6, :cond_b

    .line 312
    .line 313
    goto/16 :goto_f

    .line 314
    .line 315
    :cond_b
    :goto_6
    check-cast v4, Lmc0;

    .line 316
    .line 317
    iget-object v2, v4, Lmc0;->a:Lw35;

    .line 318
    .line 319
    if-nez v2, :cond_c

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_c
    if-eqz v0, :cond_d

    .line 323
    .line 324
    iget-object v0, v0, Lq76;->X:Ljp1;

    .line 325
    .line 326
    iget-object v4, v0, Ljp1;->Z:Llp1;

    .line 327
    .line 328
    iget-object v7, v4, Llp1;->j0:Ljava/lang/Object;

    .line 329
    .line 330
    monitor-enter v7

    .line 331
    :try_start_2
    invoke-virtual {v0}, Ljp1;->close()V

    .line 332
    .line 333
    .line 334
    iget-object v0, v0, Ljp1;->X:Lip1;

    .line 335
    .line 336
    iget-object v0, v0, Lip1;->a:Ljava/lang/String;

    .line 337
    .line 338
    invoke-virtual {v4, v0}, Llp1;->k(Ljava/lang/String;)Lsa2;

    .line 339
    .line 340
    .line 341
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 342
    monitor-exit v7

    .line 343
    if-eqz v0, :cond_f

    .line 344
    .line 345
    new-instance v4, Ly45;

    .line 346
    .line 347
    invoke-direct {v4, v0}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    goto :goto_7

    .line 351
    :catchall_0
    move-exception v0

    .line 352
    monitor-exit v7

    .line 353
    throw v0

    .line 354
    :cond_d
    iget-object v0, v1, Lo35;->d:Lvz7;

    .line 355
    .line 356
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, Lr76;

    .line 361
    .line 362
    if-eqz v0, :cond_f

    .line 363
    .line 364
    iget-object v4, v1, Lo35;->b:Lpd5;

    .line 365
    .line 366
    iget-object v4, v4, Lpd5;->e:Ljava/lang/String;

    .line 367
    .line 368
    if-nez v4, :cond_e

    .line 369
    .line 370
    iget-object v4, v1, Lo35;->a:Ljava/lang/String;

    .line 371
    .line 372
    :cond_e
    iget-object v0, v0, Lr76;->b:Llp1;

    .line 373
    .line 374
    sget-object v7, Lkb0;->f0:Lkb0;

    .line 375
    .line 376
    invoke-static {v4}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    const-string v7, "SHA-256"

    .line 381
    .line 382
    invoke-virtual {v4, v7}, Lkb0;->d(Ljava/lang/String;)Lkb0;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    invoke-virtual {v4}, Lkb0;->f()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    invoke-virtual {v0, v4}, Llp1;->k(Ljava/lang/String;)Lsa2;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    if-eqz v0, :cond_f

    .line 395
    .line 396
    new-instance v4, Ly45;

    .line 397
    .line 398
    invoke-direct {v4, v0}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    goto :goto_7

    .line 402
    :cond_f
    move-object/from16 v4, p4

    .line 403
    .line 404
    :goto_7
    if-nez v4, :cond_10

    .line 405
    .line 406
    :goto_8
    return-object p4

    .line 407
    :cond_10
    :try_start_3
    invoke-virtual {v1}, Lo35;->c()Ls92;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    iget-object v7, v4, Ly45;->X:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v7, Lsa2;

    .line 414
    .line 415
    invoke-virtual {v7, v9}, Lsa2;->d(I)Loi5;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    invoke-virtual {v0, v7, v9}, Ls92;->sink(Loi5;Z)Lsa7;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-static {v0}, Lvr3;->h(Lsa7;)Li76;

    .line 424
    .line 425
    .line 426
    move-result-object v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 427
    :try_start_4
    invoke-static {v2, v7}, Lnr4;->X(Lw35;Li76;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 428
    .line 429
    .line 430
    :try_start_5
    invoke-virtual {v7}, Li76;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 431
    .line 432
    .line 433
    move-object/from16 v0, p4

    .line 434
    .line 435
    goto :goto_a

    .line 436
    :catchall_1
    move-exception v0

    .line 437
    goto :goto_a

    .line 438
    :catchall_2
    move-exception v0

    .line 439
    move-object v11, v0

    .line 440
    :try_start_6
    invoke-virtual {v7}, Li76;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 441
    .line 442
    .line 443
    goto :goto_9

    .line 444
    :catchall_3
    move-exception v0

    .line 445
    :try_start_7
    invoke-static {v11, v0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    :goto_9
    move-object v0, v11

    .line 449
    :goto_a
    if-nez v0, :cond_15

    .line 450
    .line 451
    iget-object v0, v2, Lw35;->e:Lpe7;

    .line 452
    .line 453
    if-eqz v0, :cond_13

    .line 454
    .line 455
    invoke-virtual {v1}, Lo35;->c()Ls92;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    iget-object v7, v4, Ly45;->X:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v7, Lsa2;

    .line 462
    .line 463
    invoke-virtual {v7, v10}, Lsa2;->d(I)Loi5;

    .line 464
    .line 465
    .line 466
    move-result-object v7

    .line 467
    move-object/from16 v11, p4

    .line 468
    .line 469
    iput-object v11, v5, Ln35;->f0:Lq76;

    .line 470
    .line 471
    iput-object v3, v5, Ln35;->g0:Lw35;

    .line 472
    .line 473
    iput-object v2, v5, Ln35;->h0:Lw35;

    .line 474
    .line 475
    iput-object v4, v5, Ln35;->i0:Ly45;

    .line 476
    .line 477
    iput v8, v5, Ln35;->l0:I

    .line 478
    .line 479
    iget-object v0, v0, Lpe7;->X:Lba0;

    .line 480
    .line 481
    invoke-virtual {v1, v7, v9}, Ls92;->sink(Loi5;Z)Lsa7;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    invoke-static {v1}, Lvr3;->h(Lsa7;)Li76;

    .line 486
    .line 487
    .line 488
    move-result-object v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 489
    :try_start_8
    invoke-interface {v0, v1}, Lba0;->Z(Laa0;)J

    .line 490
    .line 491
    .line 492
    move-result-wide v7

    .line 493
    new-instance v0, Ljava/lang/Long;

    .line 494
    .line 495
    invoke-direct {v0, v7, v8}, Ljava/lang/Long;-><init>(J)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 496
    .line 497
    .line 498
    :try_start_9
    invoke-virtual {v1}, Li76;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 499
    .line 500
    .line 501
    move-object v0, v11

    .line 502
    goto :goto_e

    .line 503
    :catchall_4
    move-exception v0

    .line 504
    goto :goto_e

    .line 505
    :goto_b
    move-object v5, v0

    .line 506
    goto :goto_c

    .line 507
    :catchall_5
    move-exception v0

    .line 508
    goto :goto_b

    .line 509
    :goto_c
    :try_start_a
    invoke-virtual {v1}, Li76;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 510
    .line 511
    .line 512
    goto :goto_d

    .line 513
    :catchall_6
    move-exception v0

    .line 514
    :try_start_b
    invoke-static {v5, v0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 515
    .line 516
    .line 517
    :goto_d
    move-object v0, v5

    .line 518
    :goto_e
    if-nez v0, :cond_12

    .line 519
    .line 520
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    .line 521
    .line 522
    if-ne v0, v6, :cond_11

    .line 523
    .line 524
    :goto_f
    return-object v6

    .line 525
    :cond_11
    move-object v1, v4

    .line 526
    move-object v4, v0

    .line 527
    :goto_10
    :try_start_c
    check-cast v4, Ldn8;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    .line 528
    .line 529
    goto :goto_12

    .line 530
    :cond_12
    :try_start_d
    throw v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3

    .line 531
    :goto_11
    move-object v1, v4

    .line 532
    goto :goto_13

    .line 533
    :catch_3
    move-exception v0

    .line 534
    goto :goto_11

    .line 535
    :cond_13
    move-object/from16 v11, p4

    .line 536
    .line 537
    move-object v1, v4

    .line 538
    :goto_12
    :try_start_e
    iget-object v0, v1, Ly45;->X:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v0, Lsa2;

    .line 541
    .line 542
    iget-object v4, v0, Lsa2;->d:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v4, Llp1;

    .line 545
    .line 546
    iget-object v5, v4, Llp1;->j0:Ljava/lang/Object;

    .line 547
    .line 548
    monitor-enter v5
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    .line 549
    :try_start_f
    invoke-virtual {v0, v10}, Lsa2;->b(Z)V

    .line 550
    .line 551
    .line 552
    iget-object v0, v0, Lsa2;->a:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v0, Lip1;

    .line 555
    .line 556
    iget-object v0, v0, Lip1;->a:Ljava/lang/String;

    .line 557
    .line 558
    invoke-virtual {v4, v0}, Llp1;->m(Ljava/lang/String;)Ljp1;

    .line 559
    .line 560
    .line 561
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 562
    :try_start_10
    monitor-exit v5

    .line 563
    if-eqz v0, :cond_14

    .line 564
    .line 565
    new-instance v11, Lq76;

    .line 566
    .line 567
    invoke-direct {v11, v0}, Lq76;-><init>(Ljp1;)V

    .line 568
    .line 569
    .line 570
    :cond_14
    return-object v11

    .line 571
    :catchall_7
    move-exception v0

    .line 572
    monitor-exit v5

    .line 573
    throw v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    .line 574
    :cond_15
    :try_start_11
    throw v0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_3

    .line 575
    :goto_13
    :try_start_12
    iget-object v1, v1, Ly45;->X:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v1, Lsa2;

    .line 578
    .line 579
    invoke-virtual {v1, v9}, Lsa2;->b(Z)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_4

    .line 580
    .line 581
    .line 582
    :catch_4
    iget-object v1, v3, Lw35;->e:Lpe7;

    .line 583
    .line 584
    if-eqz v1, :cond_16

    .line 585
    .line 586
    :try_start_13
    invoke-static {v1}, Lpc6;->w(Ljava/lang/AutoCloseable;)V
    :try_end_13
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_5
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_6

    .line 587
    .line 588
    .line 589
    goto :goto_14

    .line 590
    :catch_5
    move-exception v0

    .line 591
    throw v0

    .line 592
    :catch_6
    :cond_16
    :goto_14
    iget-object v1, v2, Lw35;->e:Lpe7;

    .line 593
    .line 594
    if-eqz v1, :cond_17

    .line 595
    .line 596
    :try_start_14
    invoke-static {v1}, Lpc6;->w(Ljava/lang/AutoCloseable;)V
    :try_end_14
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_14} :catch_7
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_8

    .line 597
    .line 598
    .line 599
    goto :goto_15

    .line 600
    :catch_7
    move-exception v0

    .line 601
    throw v0

    .line 602
    :catch_8
    :cond_17
    :goto_15
    throw v0
.end method
