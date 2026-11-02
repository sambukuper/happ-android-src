.class public final Lm68;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lze2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lr68;


# direct methods
.method public synthetic constructor <init>(Lr68;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lm68;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lm68;->Y:Lr68;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte p2, p0, Lm68;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lm68;->Y:Lr68;

    .line 4
    .line 5
    sget-object v0, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ls86;

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iget-object p0, p0, Lr68;->d:Lub8;

    .line 15
    .line 16
    iget-object p1, p0, Lub8;->b:Ltb8;

    .line 17
    .line 18
    sget-object p2, Ltb8;->X:Ltb8;

    .line 19
    .line 20
    if-eq p1, p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p1, "ToolbarRequester is not initialized."

    .line 24
    .line 25
    invoke-static {p1}, Lzc3;->c(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p0, p0, Lub8;->a:Lw38;

    .line 29
    .line 30
    if-eqz p0, :cond_4

    .line 31
    .line 32
    iget-boolean p1, p0, Ljx4;->p0:Z

    .line 33
    .line 34
    if-eqz p1, :cond_4

    .line 35
    .line 36
    iget-object p1, p0, Lw38;->w0:Log7;

    .line 37
    .line 38
    const/4 p2, 0x1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Lrm3;->k()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-ne p1, p2, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    sget-object p1, Lr38;->b:Lox1;

    .line 49
    .line 50
    invoke-static {p0, p1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Lq38;

    .line 55
    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v2, Lbv;

    .line 64
    .line 65
    const/16 v3, 0xb

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v2, p0, p1, v4, v3}, Lbv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 69
    .line 70
    .line 71
    sget-object p1, Le71;->f0:Le71;

    .line 72
    .line 73
    invoke-static {v1, v4, p1, v2, p2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lw38;->w0:Log7;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p0}, Lr68;->r()V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_1
    return-object v0

    .line 84
    :pswitch_0
    check-cast p1, Lh48;

    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    invoke-virtual {p0, p1}, Lr68;->x(Z)V

    .line 88
    .line 89
    .line 90
    sget-object p1, Ls88;->X:Ls88;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Lr68;->y(Ls88;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
