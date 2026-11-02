.class public final Lw12;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lw12;->Y:B

    .line 2
    .line 3
    iput-object p1, p0, Lw12;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lw12;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lw12;->g0:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lw12;->Y:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/high16 v4, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iget-object v5, p0, Lw12;->g0:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, p0, Lw12;->f0:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Lw12;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Leq1;

    .line 18
    .line 19
    check-cast p0, Lvd7;

    .line 20
    .line 21
    check-cast v5, Llj;

    .line 22
    .line 23
    new-instance p1, Lyi;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, v6, v5, v0}, Lyi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_0
    check-cast p1, Lr12;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    if-eq p1, v3, :cond_3

    .line 39
    .line 40
    if-ne p1, v2, :cond_1

    .line 41
    .line 42
    check-cast v6, Lh62;

    .line 43
    .line 44
    iget-object p0, v6, Lh62;->a:Lbe8;

    .line 45
    .line 46
    iget-object p0, p0, Lbe8;->d:Lqw6;

    .line 47
    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    iget v4, p0, Lqw6;->a:F

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    check-cast v5, Lx77;

    .line 54
    .line 55
    iget v4, v5, Lx77;->g:F

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-static {}, Lb61;->c()V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    check-cast p0, Lg22;

    .line 63
    .line 64
    iget-object p0, p0, Lg22;->a:Lbe8;

    .line 65
    .line 66
    iget-object p0, p0, Lbe8;->d:Lqw6;

    .line 67
    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    iget v4, p0, Lqw6;->a:F

    .line 71
    .line 72
    :cond_3
    :goto_0
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_1
    return-object v1

    .line 77
    :pswitch_1
    check-cast p1, Lr12;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    if-eq p1, v3, :cond_7

    .line 86
    .line 87
    if-ne p1, v2, :cond_5

    .line 88
    .line 89
    check-cast v6, Lh62;

    .line 90
    .line 91
    iget-object p0, v6, Lh62;->a:Lbe8;

    .line 92
    .line 93
    iget-object p0, p0, Lbe8;->a:Lu72;

    .line 94
    .line 95
    if-eqz p0, :cond_4

    .line 96
    .line 97
    iget v4, p0, Lu72;->a:F

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    check-cast v5, Lx77;

    .line 101
    .line 102
    iget v4, v5, Lx77;->f:F

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    invoke-static {}, Lb61;->c()V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    check-cast p0, Lg22;

    .line 110
    .line 111
    iget-object p0, p0, Lg22;->a:Lbe8;

    .line 112
    .line 113
    iget-object p0, p0, Lbe8;->a:Lu72;

    .line 114
    .line 115
    if-eqz p0, :cond_7

    .line 116
    .line 117
    iget v4, p0, Lu72;->a:F

    .line 118
    .line 119
    :cond_7
    :goto_2
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    :goto_3
    return-object v1

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
