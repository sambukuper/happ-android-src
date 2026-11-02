.class public final synthetic Lwx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILdn2;Lkx4;Z)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput-byte p1, p0, Lwx2;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p4, p0, Lwx2;->Y:Z

    .line 8
    .line 9
    iput-object p2, p0, Lwx2;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lwx2;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLkx4;I)V
    .locals 0

    .line 14
    const/4 p4, 0x0

    iput-byte p4, p0, Lwx2;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwx2;->Z:Ljava/lang/Object;

    iput-boolean p2, p0, Lwx2;->Y:Z

    iput-object p3, p0, Lwx2;->f0:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLg73;Ljava/lang/String;)V
    .locals 1

    .line 15
    const/4 v0, 0x1

    iput-byte v0, p0, Lwx2;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwx2;->Y:Z

    iput-object p2, p0, Lwx2;->f0:Ljava/lang/Object;

    iput-object p3, p0, Lwx2;->Z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Lwx2;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lwx2;->f0:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lwx2;->Z:Ljava/lang/Object;

    .line 9
    .line 10
    iget-boolean p0, p0, Lwx2;->Y:Z

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v4, Ldn2;

    .line 16
    .line 17
    check-cast v3, Lkx4;

    .line 18
    .line 19
    check-cast p1, Llp2;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lw79;->P(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-static {p2, v4, p1, v3, p0}, Lci8;->c(ILdn2;Llp2;Lkx4;Z)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    move-object v5, v3

    .line 35
    check-cast v5, Lg73;

    .line 36
    .line 37
    move-object v7, v4

    .line 38
    check-cast v7, Ljava/lang/String;

    .line 39
    .line 40
    move-object v10, p1

    .line 41
    check-cast v10, Llp2;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    and-int/lit8 p2, p1, 0x3

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    const/4 v3, 0x0

    .line 53
    if-eq p2, v0, :cond_0

    .line 54
    .line 55
    move p2, v2

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move p2, v3

    .line 58
    :goto_0
    and-int/2addr p1, v2

    .line 59
    invoke-virtual {v10, p1, p2}, Llp2;->N(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    sget-object p1, Lhx4;->X:Lhx4;

    .line 66
    .line 67
    const/high16 p2, 0x41c00000    # 24.0f

    .line 68
    .line 69
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/b;->g(Lkx4;F)Lkx4;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    if-eqz p0, :cond_1

    .line 74
    .line 75
    const p0, 0x2a6f046f

    .line 76
    .line 77
    .line 78
    invoke-virtual {v10, p0}, Llp2;->W(I)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lep;->z:Lox1;

    .line 82
    .line 83
    invoke-virtual {v10, p0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Ldp;

    .line 88
    .line 89
    iget-object p0, p0, Ldp;->c:Lxr;

    .line 90
    .line 91
    iget-wide p0, p0, Lxr;->a:J

    .line 92
    .line 93
    invoke-virtual {v10, v3}, Llp2;->p(Z)V

    .line 94
    .line 95
    .line 96
    :goto_1
    move-wide v8, p0

    .line 97
    goto :goto_2

    .line 98
    :cond_1
    const p0, 0x2a6f0b10

    .line 99
    .line 100
    .line 101
    invoke-virtual {v10, p0}, Llp2;->W(I)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Lep;->z:Lox1;

    .line 105
    .line 106
    invoke-virtual {v10, p0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Ldp;

    .line 111
    .line 112
    iget-object p0, p0, Ldp;->c:Lxr;

    .line 113
    .line 114
    iget-wide p0, p0, Lxr;->c:J

    .line 115
    .line 116
    invoke-virtual {v10, v3}, Llp2;->p(Z)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :goto_2
    const/16 v11, 0x30

    .line 121
    .line 122
    const/4 v12, 0x0

    .line 123
    invoke-static/range {v5 .. v12}, Los4;->a(Lg73;Lkx4;Ljava/lang/String;JLlp2;II)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_2
    invoke-virtual {v10}, Llp2;->Q()V

    .line 128
    .line 129
    .line 130
    :goto_3
    return-object v1

    .line 131
    :pswitch_1
    check-cast v4, Ljava/lang/String;

    .line 132
    .line 133
    check-cast v3, Lkx4;

    .line 134
    .line 135
    check-cast p1, Llp2;

    .line 136
    .line 137
    check-cast p2, Ljava/lang/Integer;

    .line 138
    .line 139
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {v2}, Lw79;->P(I)I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    invoke-static {v4, p0, v3, p1, p2}, Lu70;->r(Ljava/lang/String;ZLkx4;Llp2;I)V

    .line 147
    .line 148
    .line 149
    return-object v1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
