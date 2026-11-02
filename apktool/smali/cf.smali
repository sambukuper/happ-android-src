.class public final Lcf;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lmn0;


# instance fields
.field public final a:Ls98;

.field public final b:Lhi0;

.field public final c:Lcl7;


# direct methods
.method public constructor <init>(Ls98;Lhi0;Lcl7;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcf;->a:Ls98;

    .line 8
    .line 9
    iput-object p2, p0, Lcf;->b:Lhi0;

    .line 10
    .line 11
    iput-object p3, p0, Lcf;->c:Lcl7;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Lyh0;Ljava/util/Map;Lsn0;)Lln0;
    .locals 14

    .line 1
    sget-object v0, Loy1;->k0:Loy1;

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcf;->b:Lhi0;

    .line 7
    .line 8
    iget v2, v1, Lhi0;->h:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move v7, v4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v5, 0x1

    .line 17
    if-ne v2, v5, :cond_1

    .line 18
    .line 19
    move v7, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v5, 0x2

    .line 22
    if-eq v2, v5, :cond_9

    .line 23
    .line 24
    move v7, v2

    .line 25
    :goto_0
    iget-object v2, p0, Lcf;->c:Lcl7;

    .line 26
    .line 27
    move-object/from16 v5, p2

    .line 28
    .line 29
    invoke-static {v1, v2, v5}, Lw51;->l(Lhi0;Lcl7;Ljava/util/Map;)Lle5;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v9, v2, Lle5;->a:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {p3 .. p3}, Lsn0;->a()V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    iget-object v5, v1, Lhi0;->d:Ljava/util/ArrayList;

    .line 49
    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    new-instance v6, Ljava/util/ArrayList;

    .line 53
    .line 54
    const/16 v8, 0xa

    .line 55
    .line 56
    invoke-static {v5, v8}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-eqz v8, :cond_3

    .line 72
    .line 73
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    check-cast v8, Lbe3;

    .line 78
    .line 79
    iget-object v8, v8, Lbe3;->a:Lel0;

    .line 80
    .line 81
    iget-object v8, v8, Lel0;->a:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v8}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    check-cast v8, Lze5;

    .line 88
    .line 89
    new-instance v10, Lhd3;

    .line 90
    .line 91
    iget-object v11, v8, Lze5;->a:Landroid/util/Size;

    .line 92
    .line 93
    invoke-virtual {v11}, Landroid/util/Size;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    iget-object v12, v8, Lze5;->a:Landroid/util/Size;

    .line 98
    .line 99
    invoke-virtual {v12}, Landroid/util/Size;->getHeight()I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    iget v8, v8, Lze5;->b:I

    .line 104
    .line 105
    invoke-direct {v10, v11, v12, v8}, Lhd3;-><init>(III)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    move-object v8, v6

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    move-object v8, v3

    .line 115
    :goto_2
    if-eqz v8, :cond_7

    .line 116
    .line 117
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_5

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_5
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-eqz v6, :cond_7

    .line 133
    .line 134
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    check-cast v6, Lhd3;

    .line 139
    .line 140
    iget v6, v6, Lhd3;->c:I

    .line 141
    .line 142
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    check-cast v10, Lhd3;

    .line 147
    .line 148
    iget v10, v10, Lhd3;->c:I

    .line 149
    .line 150
    if-ne v6, v10, :cond_6

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_6
    const-string p0, "All InputStream.Config objects must have the same format for multi resolution"

    .line 154
    .line 155
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v3

    .line 159
    :cond_7
    :goto_4
    new-instance v6, Li57;

    .line 160
    .line 161
    iget-object p0, p0, Lcf;->a:Ls98;

    .line 162
    .line 163
    iget-object p0, p0, Ls98;->j:Lvz7;

    .line 164
    .line 165
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    move-object v10, p0

    .line 170
    check-cast v10, Ljava/util/concurrent/Executor;

    .line 171
    .line 172
    iget v12, v1, Lhi0;->f:I

    .line 173
    .line 174
    iget-object v13, v1, Lhi0;->g:Ljava/util/Map;

    .line 175
    .line 176
    move-object/from16 v11, p3

    .line 177
    .line 178
    invoke-direct/range {v6 .. v13}, Li57;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/concurrent/Executor;Lsn0;ILjava/util/Map;)V

    .line 179
    .line 180
    .line 181
    invoke-interface {p1, v6}, Lyh0;->X(Li57;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_8

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {p3 .. p3}, Lsn0;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p3 .. p3}, Lsn0;->a()V

    .line 194
    .line 195
    .line 196
    return-object v0

    .line 197
    :cond_8
    new-instance p0, Lkn0;

    .line 198
    .line 199
    iget-object v0, v2, Lle5;->b:Ljava/util/LinkedHashMap;

    .line 200
    .line 201
    iget-object v1, v2, Lle5;->d:Ljava/util/LinkedHashMap;

    .line 202
    .line 203
    invoke-direct {p0, v0, v1}, Lkn0;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 204
    .line 205
    .line 206
    return-object p0

    .line 207
    :cond_9
    const-string p0, "Unsupported session mode: "

    .line 208
    .line 209
    invoke-static {v2}, Lwl7;->g0(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0, p0}, Lio/sentry/util/c;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-object v3
.end method
