.class public abstract Lym1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "DiagnosticsWrkr"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final a(Lb49;Lp49;Ll08;Ljava/util/List;)V
    .locals 16

    .line 1
    invoke-interface/range {p3 .. p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ll49;

    .line 16
    .line 17
    invoke-static {v1}, Lv18;->b(Ll49;)Ls39;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, v1, Ll49;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v4, v2, Ls39;->a:Ljava/lang/String;

    .line 27
    .line 28
    iget v2, v2, Ls39;->b:I

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object/from16 v5, p2

    .line 34
    .line 35
    iget-object v6, v5, Ll08;->a:Lql6;

    .line 36
    .line 37
    new-instance v7, Lk08;

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    invoke-direct {v7, v4, v2, v8}, Lk08;-><init>(Ljava/lang/String;IB)V

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    invoke-static {v6, v2, v8, v7}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Lj08;

    .line 49
    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    iget v4, v4, Lj08;->c:I

    .line 53
    .line 54
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    const/4 v4, 0x0

    .line 60
    :goto_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-object/from16 v6, p0

    .line 67
    .line 68
    iget-object v7, v6, Lb49;->a:Lql6;

    .line 69
    .line 70
    new-instance v9, Lnm7;

    .line 71
    .line 72
    const/4 v10, 0x4

    .line 73
    invoke-direct {v9, v3, v10}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v7, v2, v8, v9}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    move-object v9, v7

    .line 81
    check-cast v9, Ljava/util/List;

    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const/16 v14, 0x3e

    .line 85
    .line 86
    const-string v10, ","

    .line 87
    .line 88
    const/4 v11, 0x0

    .line 89
    const/4 v12, 0x0

    .line 90
    invoke-static/range {v9 .. v14}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-object/from16 v9, p1

    .line 98
    .line 99
    iget-object v10, v9, Lp49;->a:Lql6;

    .line 100
    .line 101
    new-instance v11, Lnm7;

    .line 102
    .line 103
    const/16 v12, 0x12

    .line 104
    .line 105
    invoke-direct {v11, v3, v12}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v10, v2, v8, v11}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    move-object v10, v2

    .line 113
    check-cast v10, Ljava/util/List;

    .line 114
    .line 115
    const/4 v14, 0x0

    .line 116
    const/16 v15, 0x3e

    .line 117
    .line 118
    const-string v11, ","

    .line 119
    .line 120
    const/4 v12, 0x0

    .line 121
    invoke-static/range {v10 .. v15}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v8, v1, Ll49;->c:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v1, v1, Ll49;->b:Lu39;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v10, "\n"

    .line 134
    .line 135
    const-string v11, "\t "

    .line 136
    .line 137
    invoke-static {v10, v3, v11, v8, v11}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v1, "\t"

    .line 154
    .line 155
    invoke-static {v3, v7, v11, v2, v1}, Loi0;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_1
    return-void
.end method
