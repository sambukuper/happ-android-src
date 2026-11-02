.class public final synthetic Lr48;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:Ly48;


# direct methods
.method public synthetic constructor <init>(ZLy48;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lr48;->X:B

    .line 2
    .line 3
    iput-boolean p1, p0, Lr48;->Y:Z

    .line 4
    .line 5
    iput-object p2, p0, Lr48;->Z:Ly48;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lr48;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lr48;->Z:Ly48;

    .line 5
    .line 6
    iget-boolean p0, p0, Lr48;->Y:Z

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lql;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    move v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p0, v2, Ly48;->s0:Lkd8;

    .line 19
    .line 20
    const/16 v0, 0x1c

    .line 21
    .line 22
    invoke-static {p0, p1, v3, v3, v0}, Lkd8;->h(Lkd8;Ljava/lang/CharSequence;ZZI)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, Lql;

    .line 31
    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    move v1, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object p0, v2, Ly48;->s0:Lkd8;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lkd8;->g(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p1, Lga2;

    .line 47
    .line 48
    if-nez p0, :cond_2

    .line 49
    .line 50
    move v1, v3

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    check-cast p1, Lyd;

    .line 53
    .line 54
    invoke-virtual {p1}, Lyd;->b()Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    iget-object p1, v2, Ly48;->s0:Lkd8;

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Lkd8;->g(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-object p0, v2, Ly48;->L0:Lrh5;

    .line 66
    .line 67
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljx4;->M0()Lb71;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    new-instance p1, Lv48;

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    const/4 v3, 0x3

    .line 80
    invoke-direct {p1, v2, v0, v3}, Lv48;-><init>(Ly48;Lq51;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v0, v0, p1, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 84
    .line 85
    .line 86
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
