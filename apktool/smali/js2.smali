.class public final synthetic Ljs2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lr51;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ly5;

.field public final synthetic Z:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public synthetic constructor <init>(Ly5;Ljava/util/concurrent/ExecutorService;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Ljs2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ljs2;->Y:Ly5;

    .line 4
    .line 5
    iput-object p2, p0, Ljs2;->Z:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Lfb9;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Ljs2;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Ljs2;->Z:Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    iget-object p0, p0, Ljs2;->Y:Ly5;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lfb9;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Ly5;->O(Lfb9;)Ljava/lang/Exception;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lg28;->k(Ljava/lang/Exception;)Lfb9;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1}, Lfb9;->g()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lqy;

    .line 30
    .line 31
    iget-object p1, p1, Lqy;->a:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v0, p0, Ly5;->g0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lnb2;

    .line 36
    .line 37
    check-cast v0, Lmb2;

    .line 38
    .line 39
    invoke-virtual {v0}, Lmb2;->c()Lfb9;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v2, Lks2;

    .line 44
    .line 45
    invoke-direct {v2, p0, p1}, Lks2;-><init>(Ly5;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Lfb9;->e(Ljava/util/concurrent/Executor;Lr51;)Lfb9;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_0
    return-object p0

    .line 53
    :pswitch_0
    invoke-virtual {p1}, Lfb9;->i()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    invoke-static {p1}, Ly5;->O(Lfb9;)Ljava/lang/Exception;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, Lg28;->k(Ljava/lang/Exception;)Lfb9;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {p1}, Lfb9;->g()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Landroid/util/Pair;

    .line 73
    .line 74
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v6, v0

    .line 77
    check-cast v6, Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1}, Lfb9;->g()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Landroid/util/Pair;

    .line 84
    .line 85
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v7, p1

    .line 88
    check-cast v7, Ljava/lang/String;

    .line 89
    .line 90
    iget-object p1, p0, Ly5;->Z:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Lxa2;

    .line 93
    .line 94
    invoke-virtual {p1}, Lxa2;->a()V

    .line 95
    .line 96
    .line 97
    iget-object v0, p1, Lxa2;->c:Luc2;

    .line 98
    .line 99
    iget-object v5, v0, Luc2;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p1}, Lxa2;->a()V

    .line 102
    .line 103
    .line 104
    iget-object v4, v0, Luc2;->b:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {p1}, Lr41;->g(Lxa2;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    new-instance v2, Loc6;

    .line 111
    .line 112
    invoke-direct/range {v2 .. v7}, Loc6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object p0, p0, Ly5;->Y:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p0, Lh99;

    .line 118
    .line 119
    new-instance p1, Ly18;

    .line 120
    .line 121
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    const/4 v0, 0x1

    .line 125
    iput-boolean v0, p1, Ly18;->b:Z

    .line 126
    .line 127
    sget-object v0, Lvr3;->i:Lk82;

    .line 128
    .line 129
    filled-new-array {v0}, [Lk82;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, p1, Ly18;->a:[Lk82;

    .line 134
    .line 135
    new-instance v0, Lc89;

    .line 136
    .line 137
    invoke-direct {v0, v2, p0}, Lc89;-><init>(Landroid/os/Parcelable;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p1, Ly18;->d:Ljava/lang/Object;

    .line 141
    .line 142
    const v0, 0x9859

    .line 143
    .line 144
    .line 145
    iput-char v0, p1, Ly18;->c:C

    .line 146
    .line 147
    invoke-virtual {p1}, Ly18;->a()Ly18;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, v0, p1}, Lms2;->b(ILy18;)Lfb9;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    new-instance p1, Lks2;

    .line 157
    .line 158
    invoke-direct {p1, v6, v0}, Lks2;-><init>(Ljava/lang/String;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v1, p1}, Lfb9;->d(Ljava/util/concurrent/Executor;Lr51;)Lfb9;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    :goto_1
    return-object p0

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
