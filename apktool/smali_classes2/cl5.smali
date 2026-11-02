.class public final Lcl5;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public final c:Lvz7;

.field public final d:Ljava/text/Collator;

.field public final e:Ltx0;

.field public final f:Loh7;

.field public final g:Lh76;

.field public final h:Lu77;

.field public final i:Lf76;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldw4;

    .line 5
    .line 6
    const/16 v1, 0x11

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldw4;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcl5;->b:Lvz7;

    .line 17
    .line 18
    new-instance v0, Ldw4;

    .line 19
    .line 20
    const/16 v1, 0x12

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ldw4;-><init>(B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lvz7;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lcl5;->c:Lvz7;

    .line 31
    .line 32
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lcl5;->d:Ljava/text/Collator;

    .line 37
    .line 38
    new-instance v0, Ltx0;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-direct {v0, p0, v1}, Ltx0;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcl5;->e:Ltx0;

    .line 45
    .line 46
    new-instance v2, Llk5;

    .line 47
    .line 48
    sget-object v6, Lkm5;->f0:Lkm5;

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    sget-object v3, Ljk5;->Y:Ljk5;

    .line 52
    .line 53
    const-string v4, ""

    .line 54
    .line 55
    sget-object v5, Lec7;->Y:Lec7;

    .line 56
    .line 57
    move-object v7, v5

    .line 58
    invoke-direct/range {v2 .. v8}, Llk5;-><init>(Ljk5;Ljava/lang/String;Lj2;Lkm5;Lj2;Z)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lcl5;->f:Loh7;

    .line 66
    .line 67
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Lcl5;->g:Lh76;

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    const/4 v1, 0x7

    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-static {v2, v1, v0}, Lv77;->b(IILl90;)Lu77;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lcl5;->h:Lu77;

    .line 81
    .line 82
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, Lcl5;->i:Lf76;

    .line 87
    .line 88
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/String;)Z
    .locals 11

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcl5;->g:Lh76;

    .line 11
    .line 12
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 13
    .line 14
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Llk5;

    .line 19
    .line 20
    iget-object v0, v0, Llk5;->c:Lj2;

    .line 21
    .line 22
    invoke-static {v0}, Lwv0;->d1(Ljava/lang/Iterable;)Lgu;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lgu;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_0
    move-object v1, v0

    .line 31
    check-cast v1, Lrw1;

    .line 32
    .line 33
    iget-object v2, v1, Lrw1;->Y:Ljava/util/Iterator;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Lrw1;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    move-object v2, v1

    .line 46
    check-cast v2, Lpb3;

    .line 47
    .line 48
    iget-object v2, v2, Lpb3;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lsu/happ/proxyutility/dto/AppInfo;

    .line 51
    .line 52
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const/4 v1, 0x0

    .line 73
    :goto_0
    check-cast v1, Lpb3;

    .line 74
    .line 75
    if-nez v1, :cond_2

    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    return p0

    .line 79
    :cond_2
    iget p1, v1, Lpb3;->a:I

    .line 80
    .line 81
    iget-object v0, v1, Lpb3;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lsu/happ/proxyutility/dto/AppInfo;

    .line 84
    .line 85
    iget-object p0, p0, Lcl5;->f:Loh7;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    move-object v2, v1

    .line 95
    check-cast v2, Llk5;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v3, v2, Llk5;->d:Lkm5;

    .line 101
    .line 102
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v3, v4}, Lkm5;->b(Ljava/lang/String;)Lkm5;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    iget-object v3, v2, Llk5;->c:Lj2;

    .line 111
    .line 112
    invoke-virtual {v3}, Lj2;->c()Lqm5;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    const/4 v10, 0x1

    .line 117
    invoke-static {v0, v10}, Lsu/happ/proxyutility/dto/AppInfo;->a(Lsu/happ/proxyutility/dto/AppInfo;I)Lsu/happ/proxyutility/dto/AppInfo;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v3, p1, v4}, Lqm5;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Lqm5;->c()Lj2;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    const/4 v8, 0x0

    .line 129
    const/16 v9, 0x33

    .line 130
    .line 131
    const/4 v3, 0x0

    .line 132
    const/4 v4, 0x0

    .line 133
    const/4 v7, 0x0

    .line 134
    invoke-static/range {v2 .. v9}, Llk5;->a(Llk5;Ljk5;Ljava/lang/String;Lj2;Lkm5;Lj2;ZI)Llk5;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {p0, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_3

    .line 143
    .line 144
    return v10
.end method

.method public final f()Lig8;
    .locals 0

    .line 1
    iget-object p0, p0, Lcl5;->b:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lig8;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g(Ljava/lang/String;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcl5;->g:Lh76;

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    filled-new-array {v1}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x6

    .line 15
    invoke-static {p1, v1, v2}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, v0, Lh76;->X:Loh7;

    .line 24
    .line 25
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Llk5;

    .line 30
    .line 31
    iget-object v1, v1, Llk5;->a:Ljk5;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    if-eq v1, v2, :cond_2

    .line 41
    .line 42
    const/4 v2, 0x2

    .line 43
    if-ne v1, v2, :cond_1

    .line 44
    .line 45
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 46
    .line 47
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Llk5;

    .line 52
    .line 53
    iget-object v0, v0, Llk5;->c:Lj2;

    .line 54
    .line 55
    invoke-static {v0}, Lwv0;->d1(Ljava/lang/Iterable;)Lgu;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lgu;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :cond_0
    :goto_0
    move-object v2, v0

    .line 69
    check-cast v2, Lrw1;

    .line 70
    .line 71
    iget-object v2, v2, Lrw1;->Y:Ljava/util/Iterator;

    .line 72
    .line 73
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    move-object v2, v0

    .line 80
    check-cast v2, Lrw1;

    .line 81
    .line 82
    invoke-virtual {v2}, Lrw1;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move-object v3, v2

    .line 87
    check-cast v3, Lpb3;

    .line 88
    .line 89
    iget-object v3, v3, Lpb3;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Lsu/happ/proxyutility/dto/AppInfo;

    .line 92
    .line 93
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 98
    .line 99
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_0

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    new-instance p0, Lb55;

    .line 117
    .line 118
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 119
    .line 120
    .line 121
    throw p0

    .line 122
    :cond_2
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 123
    .line 124
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Llk5;

    .line 129
    .line 130
    iget-object v0, v0, Llk5;->c:Lj2;

    .line 131
    .line 132
    invoke-static {v0}, Lwv0;->d1(Ljava/lang/Iterable;)Lgu;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-instance v1, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Lgu;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :cond_3
    :goto_1
    move-object v2, v0

    .line 146
    check-cast v2, Lrw1;

    .line 147
    .line 148
    iget-object v2, v2, Lrw1;->Y:Ljava/util/Iterator;

    .line 149
    .line 150
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_4

    .line 155
    .line 156
    move-object v2, v0

    .line 157
    check-cast v2, Lrw1;

    .line 158
    .line 159
    invoke-virtual {v2}, Lrw1;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    move-object v3, v2

    .line 164
    check-cast v3, Lpb3;

    .line 165
    .line 166
    iget-object v3, v3, Lpb3;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v3, Lsu/happ/proxyutility/dto/AppInfo;

    .line 169
    .line 170
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 175
    .line 176
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_3

    .line 188
    .line 189
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_4
    new-instance p1, Lkd;

    .line 194
    .line 195
    const/4 v0, 0x3

    .line 196
    invoke-direct {p1, v1, v0}, Lkd;-><init>(Ljava/util/ArrayList;B)V

    .line 197
    .line 198
    .line 199
    iget-object p0, p0, Lcl5;->f:Loh7;

    .line 200
    .line 201
    invoke-static {p0, p1}, Lu15;->S(Loh7;Lgn2;)V

    .line 202
    .line 203
    .line 204
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :catchall_0
    move-exception p0

    .line 208
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 209
    .line 210
    if-nez p1, :cond_6

    .line 211
    .line 212
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 213
    .line 214
    if-nez p1, :cond_6

    .line 215
    .line 216
    new-instance p1, Lrj6;

    .line 217
    .line 218
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    move-object p0, p1

    .line 222
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 223
    .line 224
    instance-of v0, p0, Lrj6;

    .line 225
    .line 226
    if-eqz v0, :cond_5

    .line 227
    .line 228
    move-object p0, p1

    .line 229
    :cond_5
    check-cast p0, Ljava/lang/Boolean;

    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    return p0

    .line 236
    :cond_6
    throw p0
.end method

.method public final h(Ljk5;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcl5;->f:Loh7;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Llk5;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/16 v9, 0x3e

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v3, p1

    .line 24
    invoke-static/range {v2 .. v9}, Llk5;->a(Llk5;Ljk5;Ljava/lang/String;Lj2;Lkm5;Lj2;ZI)Llk5;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0, v1, p1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    sget-object p1, Lx06;->a:Lvz7;

    .line 35
    .line 36
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lcom/tencent/mmkv/MMKV;

    .line 41
    .line 42
    const-string v0, "perAppProxyMode"

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p1, v1, v0}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance v0, Lyk5;

    .line 56
    .line 57
    const/16 v1, 0x8

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-direct {v0, p0, v2, v1}, Lyk5;-><init>(Lcl5;Lq51;B)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x3

    .line 64
    invoke-static {p1, v2, v0, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    move-object p1, v3

    .line 69
    goto :goto_0
.end method

.method public final i(Ls51;)V
    .locals 5

    .line 1
    instance-of v0, p1, Lbl5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lbl5;

    .line 7
    .line 8
    iget v1, v0, Lbl5;->h0:I

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
    iput v1, v0, Lbl5;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lbl5;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lbl5;-><init>(Lcl5;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lbl5;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lbl5;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcl5;->f()Lig8;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p1, p1, Lig8;->e:Lf76;

    .line 52
    .line 53
    new-instance v1, Lyk5;

    .line 54
    .line 55
    const/16 v3, 0x9

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v1, p0, v4, v3}, Lyk5;-><init>(Lcl5;Lq51;B)V

    .line 59
    .line 60
    .line 61
    iput v2, v0, Lbl5;->h0:I

    .line 62
    .line 63
    invoke-static {p1, v1, v0}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    sget-object p1, Lc71;->X:Lc71;

    .line 68
    .line 69
    if-ne p0, p1, :cond_3

    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    :goto_1
    const-string p0, "SharedFlow never completes, this call should never return."

    .line 73
    .line 74
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
