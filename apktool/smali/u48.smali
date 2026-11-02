.class public final synthetic Lu48;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ly48;


# direct methods
.method public synthetic constructor <init>(Ly48;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lu48;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lu48;->Y:Ly48;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lu48;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object v3, p1

    .line 8
    check-cast v3, Lbx3;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    iget-object v4, p0, Lu48;->Y:Ly48;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljx4;->M0()Lb71;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance v2, Lqq1;

    .line 23
    .line 24
    const/4 v7, 0x2

    .line 25
    const/4 v6, 0x0

    .line 26
    invoke-direct/range {v2 .. v7}, Lqq1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLq51;B)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Le71;->f0:Le71;

    .line 30
    .line 31
    invoke-static {p0, v6, p1, v2, v1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 32
    .line 33
    .line 34
    sget-object p0, Ldn8;->a:Ldn8;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, Lgu0;

    .line 38
    .line 39
    check-cast p2, Lhu0;

    .line 40
    .line 41
    iget-object p0, p0, Lu48;->Y:Ly48;

    .line 42
    .line 43
    invoke-virtual {p0}, Ly48;->d1()V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Ly48;->u0:Lr68;

    .line 47
    .line 48
    invoke-virtual {p2}, Lr68;->b()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Lgu0;->a:Landroid/content/ClipData;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    const/4 v0, 0x0

    .line 58
    move v2, v0

    .line 59
    move v3, v2

    .line 60
    :goto_0
    if-ge v2, p2, :cond_2

    .line 61
    .line 62
    if-nez v3, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    move v3, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    :goto_1
    move v3, v1

    .line 78
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    if-eqz v3, :cond_6

    .line 82
    .line 83
    new-instance p2, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    move v3, v0

    .line 93
    move v4, v3

    .line 94
    :goto_3
    if-ge v3, v2, :cond_5

    .line 95
    .line 96
    invoke-virtual {p1, v3}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v5}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    if-eqz v4, :cond_3

    .line 107
    .line 108
    const-string v4, "\n"

    .line 109
    .line 110
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    :cond_3
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    move v4, v1

    .line 117
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    goto :goto_4

    .line 125
    :cond_6
    const/4 p1, 0x0

    .line 126
    :goto_4
    invoke-static {p0}, Lpu;->w(Lnx4;)V

    .line 127
    .line 128
    .line 129
    if-eqz p1, :cond_7

    .line 130
    .line 131
    iget-object p0, p0, Ly48;->s0:Lkd8;

    .line 132
    .line 133
    const/16 p2, 0x1e

    .line 134
    .line 135
    invoke-static {p0, p1, v0, v0, p2}, Lkd8;->h(Lkd8;Ljava/lang/CharSequence;ZZI)V

    .line 136
    .line 137
    .line 138
    :cond_7
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
