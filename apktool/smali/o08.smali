.class public final Lo08;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/content/ComponentName;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "SystemJobInfoConverter"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lf08;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance p2, Landroid/content/ComponentName;

    .line 9
    .line 10
    const-class v0, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 11
    .line 12
    invoke-direct {p2, p1, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lo08;->a:Landroid/content/ComponentName;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ll49;I)Landroid/app/job/JobInfo;
    .locals 11

    .line 1
    iget-object v0, p1, Ll49;->j:Lp31;

    .line 2
    .line 3
    new-instance v1, Landroid/os/PersistableBundle;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "EXTRA_WORK_SPEC_ID"

    .line 9
    .line 10
    iget-object v3, p1, Ll49;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "EXTRA_WORK_SPEC_GENERATION"

    .line 16
    .line 17
    iget v3, p1, Ll49;->t:I

    .line 18
    .line 19
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const-string v2, "EXTRA_IS_PERIODIC"

    .line 23
    .line 24
    invoke-virtual {p1}, Ll49;->c()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Landroid/app/job/JobInfo$Builder;

    .line 32
    .line 33
    iget-object p0, p0, Lo08;->a:Landroid/content/ComponentName;

    .line 34
    .line 35
    invoke-direct {v2, p2, p0}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 36
    .line 37
    .line 38
    iget-boolean p0, v0, Lp31;->c:Z

    .line 39
    .line 40
    invoke-virtual {v2, p0}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget-boolean p2, v0, Lp31;->d:Z

    .line 45
    .line 46
    invoke-virtual {p0, p2}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0, v1}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v0}, Lp31;->a()Landroid/net/NetworkRequest;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    const/16 v3, 0x1a

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x1

    .line 64
    const/16 v6, 0x1c

    .line 65
    .line 66
    if-lt v2, v6, :cond_0

    .line 67
    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetwork(Landroid/net/NetworkRequest;)Landroid/app/job/JobInfo$Builder;

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_0
    iget-object v1, v0, Lp31;->a:Lb45;

    .line 78
    .line 79
    const/16 v7, 0x1e

    .line 80
    .line 81
    if-lt v2, v7, :cond_1

    .line 82
    .line 83
    sget-object v7, Lb45;->h0:Lb45;

    .line 84
    .line 85
    if-ne v1, v7, :cond_1

    .line 86
    .line 87
    new-instance v1, Landroid/net/NetworkRequest$Builder;

    .line 88
    .line 89
    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 90
    .line 91
    .line 92
    const/16 v7, 0x19

    .line 93
    .line 94
    invoke-virtual {v1, v7}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {p0, v1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetwork(Landroid/net/NetworkRequest;)Landroid/app/job/JobInfo$Builder;

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_5

    .line 111
    .line 112
    if-eq v7, v5, :cond_4

    .line 113
    .line 114
    const/4 v8, 0x2

    .line 115
    if-eq v7, v8, :cond_6

    .line 116
    .line 117
    const/4 v8, 0x3

    .line 118
    if-eq v7, v8, :cond_6

    .line 119
    .line 120
    const/4 v8, 0x4

    .line 121
    if-eq v7, v8, :cond_2

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    if-lt v2, v3, :cond_3

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    :goto_0
    invoke-static {}, Llh4;->P0()Llh4;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    :cond_4
    move v8, v5

    .line 138
    goto :goto_1

    .line 139
    :cond_5
    move v8, v4

    .line 140
    :cond_6
    :goto_1
    invoke-virtual {p0, v8}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 141
    .line 142
    .line 143
    :goto_2
    if-nez p2, :cond_8

    .line 144
    .line 145
    iget-object p2, p1, Ll49;->l:Lz00;

    .line 146
    .line 147
    sget-object v1, Lz00;->Y:Lz00;

    .line 148
    .line 149
    if-ne p2, v1, :cond_7

    .line 150
    .line 151
    move p2, v4

    .line 152
    goto :goto_3

    .line 153
    :cond_7
    move p2, v5

    .line 154
    :goto_3
    iget-wide v7, p1, Ll49;->m:J

    .line 155
    .line 156
    invoke-virtual {p0, v7, v8, p2}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    .line 157
    .line 158
    .line 159
    :cond_8
    invoke-virtual {p1}, Ll49;->a()J

    .line 160
    .line 161
    .line 162
    move-result-wide v7

    .line 163
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 164
    .line 165
    .line 166
    move-result-wide v9

    .line 167
    sub-long/2addr v7, v9

    .line 168
    const-wide/16 v9, 0x0

    .line 169
    .line 170
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 171
    .line 172
    .line 173
    move-result-wide v7

    .line 174
    if-gt v2, v6, :cond_9

    .line 175
    .line 176
    invoke-virtual {p0, v7, v8}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_9
    cmp-long p2, v7, v9

    .line 181
    .line 182
    if-lez p2, :cond_a

    .line 183
    .line 184
    invoke-virtual {p0, v7, v8}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_a
    iget-boolean p2, p1, Ll49;->q:Z

    .line 189
    .line 190
    if-nez p2, :cond_b

    .line 191
    .line 192
    invoke-virtual {p0, v5}, Landroid/app/job/JobInfo$Builder;->setImportantWhileForeground(Z)Landroid/app/job/JobInfo$Builder;

    .line 193
    .line 194
    .line 195
    :cond_b
    :goto_4
    invoke-virtual {v0}, Lp31;->b()Z

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-eqz p2, :cond_d

    .line 200
    .line 201
    iget-object p2, v0, Lp31;->i:Ljava/util/Set;

    .line 202
    .line 203
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_c

    .line 212
    .line 213
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    check-cast v1, Lo31;

    .line 218
    .line 219
    iget-boolean v2, v1, Lo31;->b:Z

    .line 220
    .line 221
    new-instance v6, Landroid/app/job/JobInfo$TriggerContentUri;

    .line 222
    .line 223
    iget-object v1, v1, Lo31;->a:Landroid/net/Uri;

    .line 224
    .line 225
    invoke-direct {v6, v1, v2}, Landroid/app/job/JobInfo$TriggerContentUri;-><init>(Landroid/net/Uri;I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v6}, Landroid/app/job/JobInfo$Builder;->addTriggerContentUri(Landroid/app/job/JobInfo$TriggerContentUri;)Landroid/app/job/JobInfo$Builder;

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_c
    iget-wide v1, v0, Lp31;->g:J

    .line 233
    .line 234
    invoke-virtual {p0, v1, v2}, Landroid/app/job/JobInfo$Builder;->setTriggerContentUpdateDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 235
    .line 236
    .line 237
    iget-wide v1, v0, Lp31;->h:J

    .line 238
    .line 239
    invoke-virtual {p0, v1, v2}, Landroid/app/job/JobInfo$Builder;->setTriggerContentMaxDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 240
    .line 241
    .line 242
    :cond_d
    invoke-virtual {p0, v4}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    .line 243
    .line 244
    .line 245
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 246
    .line 247
    if-lt p2, v3, :cond_e

    .line 248
    .line 249
    iget-boolean v1, v0, Lp31;->e:Z

    .line 250
    .line 251
    invoke-virtual {p0, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresBatteryNotLow(Z)Landroid/app/job/JobInfo$Builder;

    .line 252
    .line 253
    .line 254
    iget-boolean v0, v0, Lp31;->f:Z

    .line 255
    .line 256
    invoke-virtual {p0, v0}, Landroid/app/job/JobInfo$Builder;->setRequiresStorageNotLow(Z)Landroid/app/job/JobInfo$Builder;

    .line 257
    .line 258
    .line 259
    :cond_e
    iget v0, p1, Ll49;->k:I

    .line 260
    .line 261
    if-lez v0, :cond_f

    .line 262
    .line 263
    move v0, v5

    .line 264
    goto :goto_6

    .line 265
    :cond_f
    move v0, v4

    .line 266
    :goto_6
    cmp-long v1, v7, v9

    .line 267
    .line 268
    if-lez v1, :cond_10

    .line 269
    .line 270
    move v4, v5

    .line 271
    :cond_10
    const/16 v1, 0x1f

    .line 272
    .line 273
    if-lt p2, v1, :cond_11

    .line 274
    .line 275
    iget-boolean v1, p1, Ll49;->q:Z

    .line 276
    .line 277
    if-eqz v1, :cond_11

    .line 278
    .line 279
    if-nez v0, :cond_11

    .line 280
    .line 281
    if-nez v4, :cond_11

    .line 282
    .line 283
    invoke-virtual {p0, v5}, Landroid/app/job/JobInfo$Builder;->setExpedited(Z)Landroid/app/job/JobInfo$Builder;

    .line 284
    .line 285
    .line 286
    :cond_11
    const/16 v0, 0x23

    .line 287
    .line 288
    if-lt p2, v0, :cond_12

    .line 289
    .line 290
    iget-object p1, p1, Ll49;->x:Ljava/lang/String;

    .line 291
    .line 292
    if-eqz p1, :cond_12

    .line 293
    .line 294
    invoke-virtual {p0, p1}, Landroid/app/job/JobInfo$Builder;->setTraceTag(Ljava/lang/String;)Landroid/app/job/JobInfo$Builder;

    .line 295
    .line 296
    .line 297
    :cond_12
    invoke-virtual {p0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    return-object p0
.end method
