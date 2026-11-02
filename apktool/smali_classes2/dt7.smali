.class public abstract Ldt7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;Lgn2;Lkx4;Llp2;I)V
    .locals 11

    .line 1
    move v6, p4

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v0, 0x55736f9f

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3, v0}, Llp2;->X(I)Llp2;

    .line 12
    .line 13
    .line 14
    and-int/lit8 v0, v6, 0x6

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p3, v0}, Llp2;->d(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x2

    .line 31
    :goto_0
    or-int/2addr v0, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v0, v6

    .line 34
    :goto_1
    and-int/lit8 v1, v6, 0x30

    .line 35
    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p3, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v1, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v1

    .line 50
    :cond_3
    and-int/lit16 v1, v6, 0x180

    .line 51
    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    invoke-virtual {p3, p2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    const/16 v1, 0x100

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/16 v1, 0x80

    .line 64
    .line 65
    :goto_3
    or-int/2addr v0, v1

    .line 66
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 67
    .line 68
    const/16 v2, 0x92

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    const/4 v7, 0x1

    .line 72
    if-eq v1, v2, :cond_6

    .line 73
    .line 74
    move v1, v7

    .line 75
    goto :goto_4

    .line 76
    :cond_6
    move v1, v4

    .line 77
    :goto_4
    and-int/2addr v0, v7

    .line 78
    invoke-virtual {p3, v0, v1}, Llp2;->N(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_b

    .line 83
    .line 84
    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 85
    .line 86
    sget v1, Lm26;->subscription_config_sort_type:I

    .line 87
    .line 88
    sget-object v2, Lpc;->c:Lz01;

    .line 89
    .line 90
    invoke-virtual {p3, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Landroid/content/res/Resources;

    .line 95
    .line 96
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p3, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-virtual {p3}, Llp2;->K()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    if-nez v2, :cond_7

    .line 109
    .line 110
    sget-object v2, Lzz0;->a:Lbe;

    .line 111
    .line 112
    if-ne v5, v2, :cond_9

    .line 113
    .line 114
    :cond_7
    sget-object v2, Lec7;->Y:Lec7;

    .line 115
    .line 116
    invoke-virtual {v2}, Lec7;->c()Lqm5;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    array-length v5, v1

    .line 121
    move v8, v4

    .line 122
    :goto_5
    if-ge v8, v5, :cond_8

    .line 123
    .line 124
    aget-object v9, v1, v8

    .line 125
    .line 126
    new-instance v10, Lox2;

    .line 127
    .line 128
    invoke-direct {v10, v9}, Lox2;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v10}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    add-int/lit8 v8, v8, 0x1

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_8
    invoke-virtual {v2}, Lqm5;->c()Lj2;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {p3, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_9
    check-cast v5, Lj2;

    .line 145
    .line 146
    sget-object v1, Lht;->c:Ldt;

    .line 147
    .line 148
    sget-object v2, Lpz2;->q0:Ln50;

    .line 149
    .line 150
    invoke-static {v1, v2, p3, v4}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iget-wide v8, p3, Llp2;->T:J

    .line 155
    .line 156
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    invoke-virtual {p3}, Llp2;->l()Lkl5;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-static {p3, p2}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    sget-object v9, Luz0;->j:Lpz2;

    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p3}, Llp2;->Z()V

    .line 174
    .line 175
    .line 176
    iget-boolean v9, p3, Llp2;->S:Z

    .line 177
    .line 178
    if-eqz v9, :cond_a

    .line 179
    .line 180
    invoke-virtual {p3}, Llp2;->k()V

    .line 181
    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_a
    invoke-virtual {p3}, Llp2;->j0()V

    .line 185
    .line 186
    .line 187
    :goto_6
    sget-object v9, Lpz2;->B0:Ldx0;

    .line 188
    .line 189
    invoke-static {v9, p3, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 193
    .line 194
    invoke-static {v1, p3, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 202
    .line 203
    invoke-static {v2, p3, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-static {p3}, Lpn7;->l(Llp2;)V

    .line 207
    .line 208
    .line 209
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 210
    .line 211
    invoke-static {v1, p3, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 215
    .line 216
    sget v2, Ly46;->sub_properties_server_sort_title:I

    .line 217
    .line 218
    invoke-static {v2, p3}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    new-instance v4, Lh64;

    .line 223
    .line 224
    invoke-direct {v4, p0, v5, p1, v0}, Lh64;-><init>(Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;Lj2;Lgn2;Lkx4;)V

    .line 225
    .line 226
    .line 227
    const v0, -0x500b780b

    .line 228
    .line 229
    .line 230
    invoke-static {v0, v4, p3}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    const/16 v4, 0x186

    .line 235
    .line 236
    const/4 v5, 0x0

    .line 237
    move-object v3, v2

    .line 238
    move-object v2, v0

    .line 239
    move-object v0, v1

    .line 240
    move-object v1, v3

    .line 241
    move-object v3, p3

    .line 242
    invoke-static/range {v0 .. v5}, Lci8;->a(Lkx4;Ljava/lang/String;Lzy0;Llp2;II)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p3, v7}, Llp2;->p(Z)V

    .line 246
    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_b
    invoke-virtual {p3}, Llp2;->Q()V

    .line 250
    .line 251
    .line 252
    :goto_7
    invoke-virtual {p3}, Llp2;->r()Lj86;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    if-eqz v7, :cond_c

    .line 257
    .line 258
    new-instance v0, Lg8;

    .line 259
    .line 260
    const/16 v5, 0x14

    .line 261
    .line 262
    move-object v1, p0

    .line 263
    move-object v2, p1

    .line 264
    move-object v3, p2

    .line 265
    move v4, v6

    .line 266
    invoke-direct/range {v0 .. v5}, Lg8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 267
    .line 268
    .line 269
    iput-object v0, v7, Lj86;->d:Lrn2;

    .line 270
    .line 271
    :cond_c
    return-void
.end method

.method public static b(Landroid/widget/LinearLayout;Landroid/view/View;)Z
    .locals 1

    .line 1
    :goto_0
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v0, p1, Landroid/view/View;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    check-cast p1, Landroid/view/View;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static final c(Ljava/io/BufferedReader;)Lu27;
    .locals 2

    .line 1
    new-instance v0, Lhu;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lt21;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lt21;-><init>(Lu27;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public static final d(Ljava/io/BufferedReader;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p0}, Ldt7;->c(Ljava/io/BufferedReader;)Lu27;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lt21;

    .line 11
    .line 12
    invoke-virtual {v1}, Lt21;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    :catchall_1
    move-exception v1

    .line 43
    invoke-static {p0, v0}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v1
.end method

.method public static final e(Ljava/io/Reader;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2000

    .line 7
    .line 8
    new-array v1, v1, [C

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    :goto_0
    if-ltz v2, :cond_0

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/Writer;->write([CII)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/Integer;)V
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/content/ComponentName;

    .line 6
    .line 7
    const-class v2, Lsu/happ/proxyutility/receiver/WidgetProvider;

    .line 8
    .line 9
    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Landroid/content/Intent;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "android.appwidget.action.APPWIDGET_UPDATE"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "appWidgetIds"

    .line 32
    .line 33
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "key"

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public abstract g(Ljh8;Lx14;)Lzk6;
.end method
