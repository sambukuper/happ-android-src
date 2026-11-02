.class public abstract Lec1;
.super Lkb8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp51;


# instance fields
.field public final f0:Ljava/lang/Boolean;

.field public final g0:Ljava/text/DateFormat;

.field public final h0:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Boolean;Ljava/text/DateFormat;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lec1;->f0:Ljava/lang/Boolean;

    .line 6
    .line 7
    iput-object p3, p0, Lec1;->g0:Ljava/text/DateFormat;

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 16
    .line 17
    .line 18
    :goto_0
    iput-object p1, p0, Lec1;->h0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lt37;Ld50;)Lar3;
    .locals 11

    .line 1
    iget-object v0, p0, Llj7;->X:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Llj7;->k(Lt37;Ld50;Ljava/lang/Class;)Lno3;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v1, p1, Lt37;->X:Ll37;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    iget-object v2, p2, Lno3;->f0:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p2, Lno3;->Z:Ljava/util/Locale;

    .line 16
    .line 17
    iget-object v4, p2, Lno3;->X:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v5, p2, Lno3;->Y:Lmo3;

    .line 20
    .line 21
    invoke-virtual {v5}, Lmo3;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x0

    .line 26
    if-eqz v6, :cond_1

    .line 27
    .line 28
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p0, p1, v7}, Lec1;->t(Ljava/lang/Boolean;Ljava/text/DateFormat;)Lec1;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    if-eqz v4, :cond_6

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-lez v6, :cond_6

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object p1, v1, Lvp4;->Y:Ll20;

    .line 47
    .line 48
    iget-object v3, p1, Ll20;->h0:Ljava/util/Locale;

    .line 49
    .line 50
    :goto_0
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 51
    .line 52
    invoke-direct {p1, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Lno3;->b()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget-object v0, p2, Lno3;->j0:Ljava/util/TimeZone;

    .line 62
    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    if-nez v2, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {v2}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    iput-object v7, p2, Lno3;->j0:Ljava/util/TimeZone;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move-object v7, v0

    .line 76
    goto :goto_1

    .line 77
    :cond_5
    iget-object p2, v1, Lvp4;->Y:Ll20;

    .line 78
    .line 79
    sget-object v7, Ll20;->j0:Ljava/util/TimeZone;

    .line 80
    .line 81
    :goto_1
    invoke-virtual {p1, v7}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 82
    .line 83
    .line 84
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {p0, p2, p1}, Lec1;->t(Ljava/lang/Boolean;Ljava/text/DateFormat;)Lec1;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_6
    const/4 v4, 0x0

    .line 92
    const/4 v6, 0x1

    .line 93
    if-eqz v3, :cond_7

    .line 94
    .line 95
    move v8, v6

    .line 96
    goto :goto_2

    .line 97
    :cond_7
    move v8, v4

    .line 98
    :goto_2
    invoke-virtual {p2}, Lno3;->b()Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    sget-object v10, Lmo3;->g0:Lmo3;

    .line 103
    .line 104
    if-ne v5, v10, :cond_8

    .line 105
    .line 106
    move v4, v6

    .line 107
    :cond_8
    if-nez v8, :cond_9

    .line 108
    .line 109
    if-nez v9, :cond_9

    .line 110
    .line 111
    if-nez v4, :cond_9

    .line 112
    .line 113
    :goto_3
    return-object p0

    .line 114
    :cond_9
    iget-object v1, v1, Lvp4;->Y:Ll20;

    .line 115
    .line 116
    iget-object v1, v1, Ll20;->g0:Ljava/text/DateFormat;

    .line 117
    .line 118
    instance-of v4, v1, Lej7;

    .line 119
    .line 120
    if-eqz v4, :cond_11

    .line 121
    .line 122
    check-cast v1, Lej7;

    .line 123
    .line 124
    if-eqz v3, :cond_b

    .line 125
    .line 126
    iget-object p1, v1, Lej7;->Y:Ljava/util/Locale;

    .line 127
    .line 128
    invoke-virtual {v3, p1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_a

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_a
    new-instance p1, Lej7;

    .line 136
    .line 137
    iget-object v0, v1, Lej7;->X:Ljava/util/TimeZone;

    .line 138
    .line 139
    iget-object v1, v1, Lej7;->Z:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-direct {p1, v0, v3, v1}, Lej7;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;Ljava/lang/Boolean;)V

    .line 142
    .line 143
    .line 144
    move-object v1, p1

    .line 145
    :cond_b
    :goto_4
    invoke-virtual {p2}, Lno3;->b()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_10

    .line 150
    .line 151
    iget-object p1, p2, Lno3;->j0:Ljava/util/TimeZone;

    .line 152
    .line 153
    if-nez p1, :cond_d

    .line 154
    .line 155
    if-nez v2, :cond_c

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_c
    invoke-static {v2}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    iput-object v7, p2, Lno3;->j0:Ljava/util/TimeZone;

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_d
    move-object v7, p1

    .line 166
    :goto_5
    if-nez v7, :cond_e

    .line 167
    .line 168
    sget-object v7, Lej7;->k0:Ljava/util/TimeZone;

    .line 169
    .line 170
    :cond_e
    iget-object p1, v1, Lej7;->X:Ljava/util/TimeZone;

    .line 171
    .line 172
    if-eq v7, p1, :cond_10

    .line 173
    .line 174
    invoke-virtual {v7, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_f

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_f
    new-instance p1, Lej7;

    .line 182
    .line 183
    iget-object p2, v1, Lej7;->Y:Ljava/util/Locale;

    .line 184
    .line 185
    iget-object v0, v1, Lej7;->Z:Ljava/lang/Boolean;

    .line 186
    .line 187
    invoke-direct {p1, v7, p2, v0}, Lej7;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;Ljava/lang/Boolean;)V

    .line 188
    .line 189
    .line 190
    move-object v1, p1

    .line 191
    :cond_10
    :goto_6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-virtual {p0, p1, v1}, Lec1;->t(Ljava/lang/Boolean;Ljava/text/DateFormat;)Lec1;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :cond_11
    instance-of v4, v1, Ljava/text/SimpleDateFormat;

    .line 199
    .line 200
    if-eqz v4, :cond_16

    .line 201
    .line 202
    check-cast v1, Ljava/text/SimpleDateFormat;

    .line 203
    .line 204
    if-eqz v8, :cond_12

    .line 205
    .line 206
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-direct {p1, v0, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 213
    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_12
    invoke-virtual {v1}, Ljava/text/SimpleDateFormat;->clone()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, Ljava/text/SimpleDateFormat;

    .line 221
    .line 222
    :goto_7
    iget-object v0, p2, Lno3;->j0:Ljava/util/TimeZone;

    .line 223
    .line 224
    if-nez v0, :cond_14

    .line 225
    .line 226
    if-nez v2, :cond_13

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_13
    invoke-static {v2}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    iput-object v7, p2, Lno3;->j0:Ljava/util/TimeZone;

    .line 234
    .line 235
    goto :goto_8

    .line 236
    :cond_14
    move-object v7, v0

    .line 237
    :goto_8
    if-eqz v7, :cond_15

    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/text/DateFormat;->getTimeZone()Ljava/util/TimeZone;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    invoke-virtual {v7, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result p2

    .line 247
    if-nez p2, :cond_15

    .line 248
    .line 249
    invoke-virtual {p1, v7}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 250
    .line 251
    .line 252
    :cond_15
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 253
    .line 254
    invoke-virtual {p0, p2, p1}, Lec1;->t(Ljava/lang/Boolean;Ljava/text/DateFormat;)Lec1;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0

    .line 259
    :cond_16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    new-instance p2, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string v1, "Configured `DateFormat` ("

    .line 270
    .line 271
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string p0, ") not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`"

    .line 278
    .line 279
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    invoke-virtual {p1, v0, p0}, Lt37;->z(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    throw v7
.end method

.method public final c(Lt37;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final r(Lt37;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lec1;->f0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object v0, p0, Lec1;->g0:Ljava/text/DateFormat;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    sget-object p0, Ln37;->n0:Ln37;

    .line 18
    .line 19
    iget-object p1, p1, Lt37;->X:Ll37;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ll37;->j(Ln37;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    iget-object p0, p0, Llj7;->X:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "Null SerializerProvider passed for "

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    return v1
.end method

.method public final s(Ljava/util/Date;Lro3;Lt37;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lec1;->g0:Ljava/text/DateFormat;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object p0, Ln37;->n0:Ln37;

    .line 9
    .line 10
    iget-object v0, p3, Lt37;->X:Ll37;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ll37;->j(Ln37;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    invoke-virtual {p2, p0, p1}, Lro3;->u0(J)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p3}, Lt37;->d()Ljava/text/DateFormat;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p2, p0}, Lro3;->c1(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :cond_1
    iget-object p0, p0, Lec1;->h0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 39
    .line 40
    const/4 p3, 0x0

    .line 41
    invoke-virtual {p0, p3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/text/DateFormat;

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/text/DateFormat;->clone()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v1, v0

    .line 54
    check-cast v1, Ljava/text/DateFormat;

    .line 55
    .line 56
    :cond_2
    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p2, p1}, Lro3;->c1(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {p0, p3, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    return-void
.end method

.method public t(Ljava/lang/Boolean;Ljava/text/DateFormat;)Lec1;
    .locals 0

    .line 1
    new-instance p0, Lcd0;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcd0;-><init>(Ljava/lang/Boolean;Ljava/text/DateFormat;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
