.class public final synthetic Lyy0;
.super Ly6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic j0:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lyy0;->j0:B

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Ly6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lyy0;->j0:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    sget-object v2, Ldn8;->a:Ldn8;

    .line 5
    .line 6
    iget-object p0, p0, Ly6;->X:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ltu8;

    .line 12
    .line 13
    iget-wide v5, p1, Ltu8;->a:J

    .line 14
    .line 15
    check-cast p2, Lq51;

    .line 16
    .line 17
    move-object v4, p0

    .line 18
    check-cast v4, Lmy6;

    .line 19
    .line 20
    iget-object p0, v4, Lmy6;->L0:Lz47;

    .line 21
    .line 22
    invoke-virtual {p0}, Lz47;->F()Lb71;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance v3, Lx2;

    .line 27
    .line 28
    const/4 v8, 0x3

    .line 29
    const/4 v7, 0x0

    .line 30
    invoke-direct/range {v3 .. v8}, Lx2;-><init>(Lmy6;JLq51;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v7, v7, v3, v1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :pswitch_0
    check-cast p1, Ltu8;

    .line 38
    .line 39
    iget-wide v5, p1, Ltu8;->a:J

    .line 40
    .line 41
    check-cast p2, Lq51;

    .line 42
    .line 43
    move-object v4, p0

    .line 44
    check-cast v4, Lmy6;

    .line 45
    .line 46
    iget-object p0, v4, Lmy6;->L0:Lz47;

    .line 47
    .line 48
    invoke-virtual {p0}, Lz47;->F()Lb71;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance v3, Lx2;

    .line 53
    .line 54
    const/4 v8, 0x2

    .line 55
    const/4 v7, 0x0

    .line 56
    invoke-direct/range {v3 .. v8}, Lx2;-><init>(Lmy6;JLq51;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v7, v7, v3, v1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    check-cast p2, Lq51;

    .line 70
    .line 71
    check-cast p0, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;

    .line 72
    .line 73
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget-object p2, p2, Lrl2;->j0:Landroid/widget/LinearLayout;

    .line 78
    .line 79
    xor-int/lit8 v0, p1, 0x1

    .line 80
    .line 81
    invoke-virtual {p2, v0}, Landroid/view/View;->setClickable(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    iget-object p0, p0, Lrl2;->Y:Landroid/widget/ProgressBar;

    .line 89
    .line 90
    if-eqz p1, :cond_0

    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    const/16 p1, 0x8

    .line 95
    .line 96
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    return-object v2

    .line 100
    :pswitch_2
    check-cast p1, Llp2;

    .line 101
    .line 102
    check-cast p2, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    check-cast p0, Lzy0;

    .line 109
    .line 110
    invoke-virtual {p0, p2, p1}, Lzy0;->c(ILlp2;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    return-object v2

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
