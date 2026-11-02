.class public final synthetic Lsw0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lai2;Lai2;Ls86;ILsn;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lsw0;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsw0;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lsw0;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lsw0;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iput p4, p0, Lsw0;->Y:I

    .line 14
    .line 15
    iput-object p5, p0, Lsw0;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>([Leo5;Ltw0;ILzr4;[I)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput-byte v0, p0, Lsw0;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsw0;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lsw0;->f0:Ljava/lang/Object;

    iput p3, p0, Lsw0;->Y:I

    iput-object p4, p0, Lsw0;->g0:Ljava/lang/Object;

    iput-object p5, p0, Lsw0;->h0:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Lsw0;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lsw0;->h0:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, Lsw0;->Y:I

    .line 7
    .line 8
    iget-object v4, p0, Lsw0;->g0:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, Lsw0;->f0:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Lsw0;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Lai2;

    .line 18
    .line 19
    check-cast v5, Lai2;

    .line 20
    .line 21
    check-cast v4, Ls86;

    .line 22
    .line 23
    check-cast v2, Lsn;

    .line 24
    .line 25
    check-cast p1, Lk50;

    .line 26
    .line 27
    invoke-static {v5}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Lmf5;->getFocusOwner()Leh2;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lgh2;

    .line 36
    .line 37
    invoke-virtual {v0}, Lgh2;->f()Lai2;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eq p0, v0, :cond_0

    .line 42
    .line 43
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v3, v2, v5, v4}, Lgs8;->n(ILsn;Lai2;Ls86;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez p0, :cond_1

    .line 55
    .line 56
    invoke-interface {p1}, Lk50;->a()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_2

    .line 61
    .line 62
    :cond_1
    move-object v1, v0

    .line 63
    :cond_2
    :goto_0
    return-object v1

    .line 64
    :pswitch_0
    check-cast p0, [Leo5;

    .line 65
    .line 66
    check-cast v5, Ltw0;

    .line 67
    .line 68
    check-cast v4, Lzr4;

    .line 69
    .line 70
    check-cast v2, [I

    .line 71
    .line 72
    check-cast p1, Ldo5;

    .line 73
    .line 74
    array-length v0, p0

    .line 75
    const/4 v6, 0x0

    .line 76
    move v7, v6

    .line 77
    :goto_1
    if-ge v6, v0, :cond_6

    .line 78
    .line 79
    aget-object v8, p0, v6

    .line 80
    .line 81
    add-int/lit8 v9, v7, 0x1

    .line 82
    .line 83
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8}, Leo5;->w()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    instance-of v11, v10, Luq6;

    .line 91
    .line 92
    if-eqz v11, :cond_3

    .line 93
    .line 94
    check-cast v10, Luq6;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move-object v10, v1

    .line 98
    :goto_2
    invoke-interface {v4}, Lug3;->getLayoutDirection()Lz24;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    if-eqz v10, :cond_4

    .line 103
    .line 104
    iget-object v10, v10, Luq6;->c:Lp71;

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    move-object v10, v1

    .line 108
    :goto_3
    if-eqz v10, :cond_5

    .line 109
    .line 110
    iget v12, v8, Leo5;->X:I

    .line 111
    .line 112
    iget-object v10, v10, Lp71;->a:Lp8;

    .line 113
    .line 114
    invoke-interface {v10, v12, v3, v11}, Lp8;->a(IILz24;)I

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    goto :goto_4

    .line 119
    :cond_5
    iget-object v10, v5, Ltw0;->b:Ln50;

    .line 120
    .line 121
    iget v12, v8, Leo5;->X:I

    .line 122
    .line 123
    invoke-virtual {v10, v12, v3, v11}, Ln50;->a(IILz24;)I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    :goto_4
    aget v7, v2, v7

    .line 128
    .line 129
    invoke-static {p1, v8, v10, v7}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 130
    .line 131
    .line 132
    add-int/lit8 v6, v6, 0x1

    .line 133
    .line 134
    move v7, v9

    .line 135
    goto :goto_1

    .line 136
    :cond_6
    sget-object p0, Ldn8;->a:Ldn8;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
