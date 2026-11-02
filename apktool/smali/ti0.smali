.class public final Lti0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Luh0;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final X:Ls15;

.field public final Y:Lit2;

.field public final Z:Lu51;

.field public final f0:Lri0;

.field public final g0:Lsi0;

.field public final h0:I


# direct methods
.method public constructor <init>(Ls15;Lit2;Lu51;Lhm2;Lri0;Lsi0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lti0;->X:Ls15;

    .line 23
    .line 24
    iput-object p2, p0, Lti0;->Y:Lit2;

    .line 25
    .line 26
    iput-object p3, p0, Lti0;->Z:Lu51;

    .line 27
    .line 28
    iput-object p5, p0, Lti0;->f0:Lri0;

    .line 29
    .line 30
    iput-object p6, p0, Lti0;->g0:Lsi0;

    .line 31
    .line 32
    sget-object p1, Lui0;->a:Lqv;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object p2, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 38
    .line 39
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, Lti0;->h0:I

    .line 44
    .line 45
    return-void
.end method

.method public static m(Lti0;JI)Lux0;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    and-int/lit8 v2, p3, 0x1

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v2, v1

    .line 13
    :goto_0
    and-int/lit8 v4, p3, 0x4

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    move-object v4, v3

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object v4, v1

    .line 20
    :goto_1
    and-int/lit8 v5, p3, 0x20

    .line 21
    .line 22
    if-eqz v5, :cond_2

    .line 23
    .line 24
    const-wide v5, 0xb2d05e00L

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-wide/from16 v5, p1

    .line 31
    .line 32
    :goto_2
    iget-object v7, v0, Lti0;->X:Ls15;

    .line 33
    .line 34
    invoke-virtual {v7}, Ls15;->a()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-nez v7, :cond_11

    .line 39
    .line 40
    iget-object v0, v0, Lti0;->Z:Lu51;

    .line 41
    .line 42
    new-instance v7, Ljava/lang/Long;

    .line 43
    .line 44
    invoke-direct {v7, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 45
    .line 46
    .line 47
    sget-object v5, Lu51;->g:Lux0;

    .line 48
    .line 49
    iget-object v6, v0, Lu51;->a:Lit2;

    .line 50
    .line 51
    sget-object v8, Ljj0;->h:Lij0;

    .line 52
    .line 53
    iget-object v9, v0, Lu51;->b:Ljj0;

    .line 54
    .line 55
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v9}, Lij0;->a(Ljj0;)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-nez v8, :cond_3

    .line 63
    .line 64
    move-object v8, v3

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    move-object v8, v1

    .line 67
    :goto_3
    invoke-static {v2, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    const/4 v10, 0x0

    .line 72
    if-nez v9, :cond_4

    .line 73
    .line 74
    invoke-static {v8, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-nez v9, :cond_4

    .line 79
    .line 80
    invoke-static {v4, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-nez v9, :cond_4

    .line 85
    .line 86
    new-instance v0, Ltj6;

    .line 87
    .line 88
    invoke-direct {v0, v10, v3}, Ltj6;-><init>(ILee;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lvr3;->a(Ljava/lang/Object;)Lux0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0

    .line 96
    :cond_4
    iget-object v9, v6, Lit2;->b:Lht2;

    .line 97
    .line 98
    invoke-virtual {v9}, Lht2;->m()Lne6;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    if-nez v9, :cond_5

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_5
    invoke-static {v8, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-eqz v9, :cond_8

    .line 110
    .line 111
    sget-object v9, Lu51;->f:Ljava/util/Map;

    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object v11, v6, Lit2;->b:Lht2;

    .line 117
    .line 118
    invoke-virtual {v11}, Lht2;->m()Lne6;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    if-eqz v12, :cond_6

    .line 123
    .line 124
    iget-object v10, v11, Lht2;->i0:Ly5;

    .line 125
    .line 126
    new-instance v11, Lbt2;

    .line 127
    .line 128
    invoke-direct {v11, v9}, Lbt2;-><init>(Ljava/util/Map;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v10, v11}, Ly5;->g0(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    goto :goto_4

    .line 136
    :cond_6
    const-string v9, "Cannot submit parameters without an active repeating request!"

    .line 137
    .line 138
    invoke-static {v9}, Lbt;->i(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :goto_4
    if-nez v10, :cond_7

    .line 142
    .line 143
    :goto_5
    return-object v5

    .line 144
    :cond_7
    iget-object v11, v0, Lu51;->c:Lqt2;

    .line 145
    .line 146
    sget-object v20, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const/16 v22, 0x2ff

    .line 151
    .line 152
    const/4 v12, 0x0

    .line 153
    const/4 v13, 0x0

    .line 154
    const/4 v14, 0x0

    .line 155
    const/4 v15, 0x0

    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    const/16 v18, 0x0

    .line 161
    .line 162
    const/16 v19, 0x0

    .line 163
    .line 164
    invoke-static/range {v11 .. v22}, Lqt2;->b(Lqt2;Ls7;Lt7;Li00;Lqd2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 165
    .line 166
    .line 167
    :cond_8
    invoke-static {v2, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    invoke-static {v8, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    invoke-static {v4, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    if-nez v5, :cond_9

    .line 180
    .line 181
    if-nez v8, :cond_9

    .line 182
    .line 183
    if-nez v9, :cond_9

    .line 184
    .line 185
    sget-object v5, Le02;->X:Le02;

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 189
    .line 190
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 191
    .line 192
    .line 193
    if-eqz v5, :cond_a

    .line 194
    .line 195
    sget-object v5, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 196
    .line 197
    sget-object v11, Lu51;->h:Ljava/util/List;

    .line 198
    .line 199
    invoke-interface {v10, v5, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    :cond_a
    if-eqz v8, :cond_b

    .line 203
    .line 204
    sget-object v5, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 205
    .line 206
    sget-object v8, Lu51;->i:Ljava/util/List;

    .line 207
    .line 208
    invoke-interface {v10, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    :cond_b
    if-eqz v9, :cond_c

    .line 212
    .line 213
    sget-object v5, Landroid/hardware/camera2/CaptureResult;->CONTROL_AWB_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 214
    .line 215
    sget-object v8, Lu51;->j:Ljava/util/List;

    .line 216
    .line 217
    invoke-interface {v10, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    :cond_c
    move-object v5, v10

    .line 221
    :goto_6
    new-instance v8, Luv5;

    .line 222
    .line 223
    const/4 v9, 0x1

    .line 224
    invoke-direct {v8, v5, v9}, Luv5;-><init>(Ljava/util/Map;B)V

    .line 225
    .line 226
    .line 227
    new-instance v5, Luj6;

    .line 228
    .line 229
    const/16 v9, 0x3c

    .line 230
    .line 231
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    invoke-direct {v5, v8, v9, v7}, Luj6;-><init>(Lgn2;Ljava/lang/Integer;Ljava/lang/Long;)V

    .line 236
    .line 237
    .line 238
    iget-object v7, v0, Lu51;->d:Lkc4;

    .line 239
    .line 240
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    iget-object v7, v7, Lkc4;->X:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 244
    .line 245
    invoke-virtual {v7, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    invoke-static {v2, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_d

    .line 253
    .line 254
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 255
    .line 256
    move-object v15, v2

    .line 257
    goto :goto_7

    .line 258
    :cond_d
    move-object v15, v3

    .line 259
    :goto_7
    invoke-static {v4, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-eqz v1, :cond_e

    .line 264
    .line 265
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 266
    .line 267
    :cond_e
    move-object/from16 v17, v3

    .line 268
    .line 269
    if-nez v15, :cond_f

    .line 270
    .line 271
    if-eqz v17, :cond_10

    .line 272
    .line 273
    :cond_f
    iget-object v7, v0, Lu51;->c:Lqt2;

    .line 274
    .line 275
    const/16 v16, 0x0

    .line 276
    .line 277
    const/16 v18, 0x17f

    .line 278
    .line 279
    const/4 v8, 0x0

    .line 280
    const/4 v9, 0x0

    .line 281
    const/4 v10, 0x0

    .line 282
    const/4 v11, 0x0

    .line 283
    const/4 v12, 0x0

    .line 284
    const/4 v13, 0x0

    .line 285
    const/4 v14, 0x0

    .line 286
    invoke-static/range {v7 .. v18}, Lqt2;->b(Lqt2;Ls7;Lt7;Li00;Lqd2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 287
    .line 288
    .line 289
    :cond_10
    iget-object v0, v0, Lu51;->c:Lqt2;

    .line 290
    .line 291
    invoke-virtual {v0}, Lqt2;->a()Ljava/util/LinkedHashMap;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-virtual {v6, v0}, Lit2;->d(Ljava/util/LinkedHashMap;)V

    .line 296
    .line 297
    .line 298
    iget-object v0, v5, Luj6;->f0:Lux0;

    .line 299
    .line 300
    return-object v0

    .line 301
    :cond_11
    const-string v1, "Cannot call unlock3A on "

    .line 302
    .line 303
    const-string v2, " after close."

    .line 304
    .line 305
    invoke-static {v1, v0, v2}, Lom0;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    return-object v3
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lti0;->f0:Lri0;

    .line 2
    .line 3
    iget-object v0, v0, Lri0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    monitor-exit v0

    .line 7
    iget-object v0, p0, Lti0;->g0:Lsi0;

    .line 8
    .line 9
    iget-object v0, v0, Lsi0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    monitor-exit v0

    .line 13
    iget-object p0, p0, Lti0;->X:Ls15;

    .line 14
    .line 15
    invoke-virtual {p0}, Ls15;->b()Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final k()Lux0;
    .locals 11

    .line 1
    iget-object v0, p0, Lti0;->X:Ls15;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls15;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object v2, p0, Lti0;->Z:Lu51;

    .line 11
    .line 12
    iget-object p0, v2, Lu51;->c:Lqt2;

    .line 13
    .line 14
    iget-object p0, p0, Lqt2;->a:Ltv;

    .line 15
    .line 16
    iget-object p0, p0, Ltv;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljh7;

    .line 19
    .line 20
    iget-object p0, p0, Ljh7;->a:Ls7;

    .line 21
    .line 22
    sget-object v0, Ls7;->b:Ljava/util/List;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget v3, p0, Ls7;->a:I

    .line 29
    .line 30
    if-ne v3, v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    if-nez p0, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    iget p0, p0, Ls7;->a:I

    .line 37
    .line 38
    if-nez p0, :cond_3

    .line 39
    .line 40
    :goto_1
    move-object v3, v1

    .line 41
    goto :goto_3

    .line 42
    :cond_3
    :goto_2
    new-instance v1, Ls7;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Ls7;-><init>(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :goto_3
    new-instance v6, Lqd2;

    .line 49
    .line 50
    const/4 p0, 0x2

    .line 51
    invoke-direct {v6, p0}, Lqd2;-><init>(I)V

    .line 52
    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    const/16 v10, 0x76

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    invoke-static/range {v2 .. v10}, Lu51;->a(Lu51;Ls7;Lt7;Li00;Lqd2;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)Lux0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_4
    const-string v0, "Cannot call setTorchOn on "

    .line 67
    .line 68
    const-string v2, " after close."

    .line 69
    .line 70
    invoke-static {v0, p0, v2}, Lom0;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CameraGraph.Session-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, Lti0;->h0:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
