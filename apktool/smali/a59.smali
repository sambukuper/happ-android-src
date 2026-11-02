.class public final La59;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ll49;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Lzv7;

.field public final e:Ly5;

.field public final f:Lxy0;

.field public final g:Lfv5;

.field public final h:Landroidx/work/impl/WorkDatabase;

.field public final i:Ln49;

.field public final j:Lpi1;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ldm3;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ld6;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ld6;->j0:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ll49;

    .line 7
    .line 8
    iput-object v0, p0, La59;->a:Ll49;

    .line 9
    .line 10
    iget-object v1, p1, Ld6;->k0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/content/Context;

    .line 13
    .line 14
    iput-object v1, p0, La59;->b:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v0, v0, Ll49;->a:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, La59;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, p1, Ld6;->f0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lzv7;

    .line 23
    .line 24
    iput-object v0, p0, La59;->d:Lzv7;

    .line 25
    .line 26
    iget-object v0, p1, Ld6;->g0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ly5;

    .line 29
    .line 30
    iput-object v0, p0, La59;->e:Ly5;

    .line 31
    .line 32
    iget-object v0, p1, Ld6;->Y:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lxy0;

    .line 35
    .line 36
    iput-object v0, p0, La59;->f:Lxy0;

    .line 37
    .line 38
    iget-object v0, p1, Ld6;->h0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lfv5;

    .line 41
    .line 42
    iput-object v0, p0, La59;->g:Lfv5;

    .line 43
    .line 44
    iget-object v0, p1, Ld6;->i0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 47
    .line 48
    iput-object v0, p0, La59;->h:Landroidx/work/impl/WorkDatabase;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, p0, La59;->i:Ln49;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->r()Lpi1;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La59;->j:Lpi1;

    .line 61
    .line 62
    iget-object p1, p1, Ld6;->Z:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v0, p1

    .line 65
    check-cast v0, Ljava/util/ArrayList;

    .line 66
    .line 67
    iput-object v0, p0, La59;->k:Ljava/util/ArrayList;

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    const/16 v5, 0x3e

    .line 71
    .line 72
    const-string v1, ","

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-static/range {v0 .. v5}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lu70;->g()Ldm3;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, La59;->l:Ldm3;

    .line 84
    .line 85
    new-instance p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, La59;->m:Ljava/util/ArrayList;

    .line 91
    .line 92
    new-instance p1, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, La59;->n:Ljava/util/ArrayList;

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    .line 1
    iget-object v0, p0, La59;->i:Ln49;

    .line 2
    .line 3
    sget-object v1, Lu39;->X:Lu39;

    .line 4
    .line 5
    iget-object v2, p0, La59;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ln49;->h(Lu39;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    invoke-virtual {v0, v3, v4, v2}, Ln49;->g(JLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La59;->a:Ll49;

    .line 18
    .line 19
    iget p0, p0, Ll49;->v:I

    .line 20
    .line 21
    invoke-virtual {v0, p0, v2}, Ln49;->f(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v3, -0x1

    .line 25
    .line 26
    invoke-virtual {v0, v3, v4, v2}, Ln49;->e(JLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, v2}, Ln49;->i(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, La59;->i:Ln49;

    .line 6
    .line 7
    iget-object v3, p0, La59;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v2, v0, v1, v3}, Ln49;->g(JLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lu39;->X:Lu39;

    .line 13
    .line 14
    invoke-virtual {v2, v0, v3}, Ln49;->h(Lu39;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v2, Ln49;->a:Lql6;

    .line 18
    .line 19
    new-instance v1, Lnm7;

    .line 20
    .line 21
    const/16 v4, 0xe

    .line 22
    .line 23
    invoke-direct {v1, v3, v4}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x1

    .line 28
    invoke-static {v0, v4, v5, v1}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, La59;->a:Ll49;

    .line 38
    .line 39
    iget p0, p0, Ll49;->v:I

    .line 40
    .line 41
    invoke-virtual {v2, p0, v3}, Ln49;->f(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, Lnm7;

    .line 45
    .line 46
    const/16 v1, 0xf

    .line 47
    .line 48
    invoke-direct {p0, v3, v1}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v4, v5, p0}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    const-wide/16 v0, -0x1

    .line 55
    .line 56
    invoke-virtual {v2, v0, v1, v3}, Ln49;->e(JLjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final c(I)Z
    .locals 4

    .line 1
    iget-object v0, p0, La59;->a:Ll49;

    .line 2
    .line 3
    iget-object v0, v0, Ll49;->y:Ljava/lang/Boolean;

    .line 4
    .line 5
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget v0, Lb59;->a:I

    .line 15
    .line 16
    invoke-static {}, Llh4;->P0()Llh4;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, La59;->a(I)V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_0
    iget-object v0, p0, La59;->i:Ln49;

    .line 28
    .line 29
    iget-object p0, p0, La59;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ln49;->b(Ljava/lang/String;)Lu39;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, Lu39;->a()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    sget v3, Lb59;->a:I

    .line 44
    .line 45
    invoke-static {}, Llh4;->P0()Llh4;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v2, Lu39;->X:Lu39;

    .line 56
    .line 57
    invoke-virtual {v0, v2, p0}, Ln49;->h(Lu39;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1, p0}, Ln49;->i(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-wide/16 v2, -0x1

    .line 64
    .line 65
    invoke-virtual {v0, v2, v3, p0}, Ln49;->e(JLjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return v1

    .line 69
    :cond_1
    sget p0, Lb59;->a:I

    .line 70
    .line 71
    invoke-static {}, Llh4;->P0()Llh4;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    const/4 p0, 0x0

    .line 82
    return p0
.end method

.method public final d(Ls51;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lz49;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lz49;

    .line 11
    .line 12
    iget v3, v2, Lz49;->h0:I

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
    iput v3, v2, Lz49;->h0:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lz49;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lz49;-><init>(La59;Ls51;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v6, Lz49;->f0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v2, v6, Lz49;->h0:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v7, :cond_1

    .line 40
    .line 41
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_b

    .line 45
    .line 46
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lln7;->c()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    iget-object v2, v1, La59;->a:Ll49;

    .line 60
    .line 61
    move-object v4, v3

    .line 62
    iget-object v3, v2, Ll49;->x:Ljava/lang/String;

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    if-eqz v5, :cond_9

    .line 67
    .line 68
    if-eqz v3, :cond_9

    .line 69
    .line 70
    invoke-virtual {v2}, Ll49;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 75
    .line 76
    const/16 v11, 0x1d

    .line 77
    .line 78
    const/16 v12, 0x7f

    .line 79
    .line 80
    if-lt v10, v11, :cond_4

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-gt v4, v12, :cond_3

    .line 87
    .line 88
    move-object v4, v3

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-virtual {v3, v9, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    :goto_2
    invoke-static {v0, v4}, Lwa;->a(ILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-gt v10, v12, :cond_5

    .line 103
    .line 104
    move-object v10, v3

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    invoke-virtual {v3, v9, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    :goto_3
    const-string v11, "asyncTraceBegin"

    .line 111
    .line 112
    :try_start_1
    sget-object v12, Lln7;->c:Ljava/lang/reflect/Method;

    .line 113
    .line 114
    if-nez v12, :cond_6

    .line 115
    .line 116
    const-class v12, Landroid/os/Trace;

    .line 117
    .line 118
    sget-object v13, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 119
    .line 120
    const-class v14, Ljava/lang/String;

    .line 121
    .line 122
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 123
    .line 124
    filled-new-array {v13, v14, v15}, [Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    invoke-virtual {v12, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    sput-object v12, Lln7;->c:Ljava/lang/reflect/Method;

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :catch_0
    move-exception v0

    .line 136
    goto :goto_5

    .line 137
    :cond_6
    :goto_4
    if-eqz v12, :cond_7

    .line 138
    .line 139
    sget-wide v13, Lln7;->a:J

    .line 140
    .line 141
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    filled-new-array {v11, v10, v0}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v12, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_7
    const-string v0, "Required value was null."

    .line 158
    .line 159
    new-instance v10, Ljava/lang/IllegalArgumentException;

    .line 160
    .line 161
    invoke-direct {v10, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 165
    :goto_5
    instance-of v10, v0, Ljava/lang/reflect/InvocationTargetException;

    .line 166
    .line 167
    if-eqz v10, :cond_9

    .line 168
    .line 169
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 176
    .line 177
    if-nez v1, :cond_8

    .line 178
    .line 179
    invoke-static {v0}, Lu52;->q(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    return-object v4

    .line 183
    :cond_8
    throw v0

    .line 184
    :cond_9
    :goto_6
    new-instance v0, Ls49;

    .line 185
    .line 186
    invoke-direct {v0, v1, v9}, Ls49;-><init>(La59;B)V

    .line 187
    .line 188
    .line 189
    iget-object v10, v1, La59;->h:Landroidx/work/impl/WorkDatabase;

    .line 190
    .line 191
    invoke-virtual {v10, v0}, Lql6;->n(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Ljava/lang/Boolean;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_a

    .line 202
    .line 203
    new-instance v0, Lw49;

    .line 204
    .line 205
    invoke-direct {v0, v7}, Lw49;-><init>(Z)V

    .line 206
    .line 207
    .line 208
    return-object v0

    .line 209
    :cond_a
    invoke-virtual {v2}, Ll49;->c()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    iget-object v4, v1, La59;->c:Ljava/lang/String;

    .line 214
    .line 215
    if-eqz v0, :cond_b

    .line 216
    .line 217
    iget-object v0, v2, Ll49;->e:Lu91;

    .line 218
    .line 219
    :goto_7
    move-object v14, v0

    .line 220
    goto/16 :goto_a

    .line 221
    .line 222
    :cond_b
    iget-object v0, v2, Ll49;->d:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    sget v11, Lvd3;->a:I

    .line 228
    .line 229
    :try_start_2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    check-cast v0, Landroidx/work/OverwritingInputMerger;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :catch_1
    invoke-static {}, Llh4;->P0()Llh4;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-object v0, v8

    .line 255
    :goto_8
    if-nez v0, :cond_c

    .line 256
    .line 257
    sget v0, Lb59;->a:I

    .line 258
    .line 259
    invoke-static {}, Llh4;->P0()Llh4;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    new-instance v0, Lw49;

    .line 267
    .line 268
    invoke-direct {v0, v9}, Lw49;-><init>(Z)V

    .line 269
    .line 270
    .line 271
    return-object v0

    .line 272
    :cond_c
    iget-object v0, v2, Ll49;->e:Lu91;

    .line 273
    .line 274
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    iget-object v11, v1, La59;->i:Ln49;

    .line 279
    .line 280
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    iget-object v11, v11, Ln49;->a:Lql6;

    .line 287
    .line 288
    new-instance v12, Lnm7;

    .line 289
    .line 290
    const/16 v13, 0x10

    .line 291
    .line 292
    invoke-direct {v12, v4, v13}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 293
    .line 294
    .line 295
    invoke-static {v11, v7, v9, v12}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    check-cast v11, Ljava/util/List;

    .line 300
    .line 301
    invoke-static {v0, v11}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    new-instance v11, Lt91;

    .line 306
    .line 307
    invoke-direct {v11, v9}, Lt91;-><init>(B)V

    .line 308
    .line 309
    .line 310
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 311
    .line 312
    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v13

    .line 323
    if-eqz v13, :cond_d

    .line 324
    .line 325
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v13

    .line 329
    check-cast v13, Lu91;

    .line 330
    .line 331
    iget-object v13, v13, Lu91;->a:Ljava/util/HashMap;

    .line 332
    .line 333
    invoke-static {v13}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 334
    .line 335
    .line 336
    move-result-object v13

    .line 337
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-interface {v12, v13}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 341
    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_d
    invoke-virtual {v11, v12}, Lt91;->b(Ljava/util/HashMap;)V

    .line 345
    .line 346
    .line 347
    new-instance v0, Lu91;

    .line 348
    .line 349
    iget-object v11, v11, Lt91;->a:Ljava/util/LinkedHashMap;

    .line 350
    .line 351
    invoke-direct {v0, v11}, Lu91;-><init>(Ljava/util/LinkedHashMap;)V

    .line 352
    .line 353
    .line 354
    invoke-static {v0}, Lwl7;->c0(Lu91;)[B

    .line 355
    .line 356
    .line 357
    goto/16 :goto_7

    .line 358
    .line 359
    :goto_a
    new-instance v12, Landroidx/work/WorkerParameters;

    .line 360
    .line 361
    invoke-static {v4}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 362
    .line 363
    .line 364
    move-result-object v13

    .line 365
    iget v0, v2, Ll49;->k:I

    .line 366
    .line 367
    iget v4, v2, Ll49;->t:I

    .line 368
    .line 369
    iget-object v11, v1, La59;->f:Lxy0;

    .line 370
    .line 371
    iget-object v15, v11, Lxy0;->Y:Ljava/lang/Object;

    .line 372
    .line 373
    move-object/from16 v19, v15

    .line 374
    .line 375
    check-cast v19, Ljava/util/concurrent/Executor;

    .line 376
    .line 377
    iget-object v11, v11, Lxy0;->Z:Ljava/lang/Object;

    .line 378
    .line 379
    move-object/from16 v20, v11

    .line 380
    .line 381
    check-cast v20, Lu61;

    .line 382
    .line 383
    new-instance v11, Le49;

    .line 384
    .line 385
    new-instance v11, Lr39;

    .line 386
    .line 387
    iget-object v15, v1, La59;->g:Lfv5;

    .line 388
    .line 389
    iget-object v8, v1, La59;->e:Ly5;

    .line 390
    .line 391
    invoke-direct {v11, v10, v15, v8}, Lr39;-><init>(Landroidx/work/impl/WorkDatabase;Lfv5;Ly5;)V

    .line 392
    .line 393
    .line 394
    iget-object v15, v1, La59;->k:Ljava/util/ArrayList;

    .line 395
    .line 396
    iget-object v9, v1, La59;->d:Lzv7;

    .line 397
    .line 398
    move/from16 v17, v0

    .line 399
    .line 400
    move/from16 v18, v4

    .line 401
    .line 402
    move-object/from16 v21, v8

    .line 403
    .line 404
    move-object/from16 v16, v9

    .line 405
    .line 406
    move-object/from16 v22, v11

    .line 407
    .line 408
    invoke-direct/range {v12 .. v22}, Landroidx/work/WorkerParameters;-><init>(Ljava/util/UUID;Lu91;Ljava/util/AbstractCollection;Lzv7;IILjava/util/concurrent/Executor;Lu61;Ly5;Llj2;)V

    .line 409
    .line 410
    .line 411
    :try_start_3
    sget-object v0, Lpz2;->G0:Lpz2;

    .line 412
    .line 413
    iget-object v4, v1, La59;->b:Landroid/content/Context;

    .line 414
    .line 415
    iget-object v2, v2, Ll49;->c:Ljava/lang/String;

    .line 416
    .line 417
    invoke-virtual {v0, v4, v2, v12}, Lpz2;->l(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lec4;

    .line 418
    .line 419
    .line 420
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 421
    iput-boolean v7, v2, Lec4;->d:Z

    .line 422
    .line 423
    iget-object v0, v6, Ls51;->Y:Ls61;

    .line 424
    .line 425
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    sget-object v4, Loy1;->E0:Loy1;

    .line 429
    .line 430
    invoke-interface {v0, v4}, Ls61;->H0(Lr61;)Lq61;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    move-object v9, v0

    .line 438
    check-cast v9, Lbm3;

    .line 439
    .line 440
    new-instance v0, Lkg;

    .line 441
    .line 442
    const/4 v1, 0x3

    .line 443
    move-object/from16 v4, p0

    .line 444
    .line 445
    invoke-direct/range {v0 .. v5}, Lkg;-><init>(BLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 446
    .line 447
    .line 448
    move-object v1, v4

    .line 449
    invoke-interface {v9, v0}, Lbm3;->D(Lgn2;)Lgq1;

    .line 450
    .line 451
    .line 452
    new-instance v0, Ls49;

    .line 453
    .line 454
    invoke-direct {v0, v1, v7}, Ls49;-><init>(La59;B)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v10, v0}, Lql6;->n(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    check-cast v0, Ljava/lang/Boolean;

    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-nez v0, :cond_e

    .line 471
    .line 472
    new-instance v0, Lw49;

    .line 473
    .line 474
    invoke-direct {v0, v7}, Lw49;-><init>(Z)V

    .line 475
    .line 476
    .line 477
    return-object v0

    .line 478
    :cond_e
    invoke-interface {v9}, Lbm3;->isCancelled()Z

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-eqz v0, :cond_f

    .line 483
    .line 484
    new-instance v0, Lw49;

    .line 485
    .line 486
    invoke-direct {v0, v7}, Lw49;-><init>(Z)V

    .line 487
    .line 488
    .line 489
    return-object v0

    .line 490
    :cond_f
    iget-object v3, v12, Landroidx/work/WorkerParameters;->i:Llj2;

    .line 491
    .line 492
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    iget-object v0, v8, Ly5;->h0:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v0, Lki3;

    .line 498
    .line 499
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    invoke-static {v0}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    .line 503
    .line 504
    .line 505
    move-result-object v8

    .line 506
    :try_start_4
    new-instance v0, Lbv;

    .line 507
    .line 508
    const/16 v5, 0xc

    .line 509
    .line 510
    const/4 v4, 0x0

    .line 511
    invoke-direct/range {v0 .. v5}, Lbv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 512
    .line 513
    .line 514
    iput v7, v6, Lz49;->h0:I

    .line 515
    .line 516
    invoke-static {v8, v0, v6}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 520
    sget-object v1, Lc71;->X:Lc71;

    .line 521
    .line 522
    if-ne v0, v1, :cond_10

    .line 523
    .line 524
    return-object v1

    .line 525
    :cond_10
    :goto_b
    :try_start_5
    check-cast v0, Ldc4;

    .line 526
    .line 527
    new-instance v1, Lu49;

    .line 528
    .line 529
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    invoke-direct {v1, v0}, Lu49;-><init>(Ldc4;)V
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 533
    .line 534
    .line 535
    return-object v1

    .line 536
    :catchall_0
    sget v0, Lb59;->a:I

    .line 537
    .line 538
    invoke-static {}, Llh4;->P0()Llh4;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    new-instance v0, Lt49;

    .line 546
    .line 547
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 548
    .line 549
    .line 550
    return-object v0

    .line 551
    :catch_2
    move-exception v0

    .line 552
    sget v1, Lb59;->a:I

    .line 553
    .line 554
    invoke-static {}, Llh4;->P0()Llh4;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    throw v0

    .line 562
    :catchall_1
    sget v0, Lb59;->a:I

    .line 563
    .line 564
    invoke-static {}, Llh4;->P0()Llh4;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    new-instance v0, Lw49;

    .line 572
    .line 573
    const/4 v1, 0x0

    .line 574
    invoke-direct {v0, v1}, Lw49;-><init>(Z)V

    .line 575
    .line 576
    .line 577
    return-object v0
.end method

.method public final e(Ldc4;)V
    .locals 6

    .line 1
    iget-object v0, p0, La59;->c:Ljava/lang/String;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Li21;->N([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, La59;->j:Lpi1;

    .line 12
    .line 13
    invoke-static {v2, v0}, Lw51;->B(Lpi1;Ljava/lang/String;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p0, La59;->i:Ln49;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ln49;->b(Ljava/lang/String;)Lu39;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    sget-object v5, Lu39;->h0:Lu39;

    .line 43
    .line 44
    if-eq v4, v5, :cond_0

    .line 45
    .line 46
    sget-object v4, Lu39;->f0:Lu39;

    .line 47
    .line 48
    invoke-virtual {v3, v4, v2}, Ln49;->h(Lu39;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_0

    .line 56
    .line 57
    iget-object v3, p0, La59;->n:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    check-cast p1, Lac4;

    .line 64
    .line 65
    iget-object p1, p1, Lac4;->a:Lu91;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, La59;->a:Ll49;

    .line 71
    .line 72
    iget p0, p0, Ll49;->v:I

    .line 73
    .line 74
    invoke-virtual {v3, p0, v0}, Ln49;->f(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, v3, Ln49;->a:Lql6;

    .line 78
    .line 79
    new-instance v1, Lgq6;

    .line 80
    .line 81
    const/16 v2, 0x1b

    .line 82
    .line 83
    invoke-direct {v1, p1, v0, v2}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    const/4 v0, 0x1

    .line 88
    invoke-static {p0, p1, v0, v1}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    return-void
.end method
