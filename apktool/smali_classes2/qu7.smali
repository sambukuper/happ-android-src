.class public final synthetic Lqu7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lwu7;


# direct methods
.method public synthetic constructor <init>(Lwu7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lqu7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lqu7;->Y:Lwu7;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-byte p1, p0, Lqu7;->X:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object p0, p0, Lqu7;->Y:Lwu7;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p1, Lwu7;->y1:Lcom/google/gson/a;

    .line 11
    .line 12
    iget-object p1, p0, Lwu7;->v1:Ly5;

    .line 13
    .line 14
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lpu7;

    .line 19
    .line 20
    new-instance v2, Llr5;

    .line 21
    .line 22
    const/16 v3, 0x12

    .line 23
    .line 24
    invoke-direct {v2, p0, v3}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lzw8;->a(Lxw8;)Ltu0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v3, Lt17;

    .line 32
    .line 33
    const/16 v4, 0xb

    .line 34
    .line 35
    invoke-direct {v3, p1, v2, v1, v4}, Lt17;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v3, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_0
    sget-object p1, Lwu7;->y1:Lcom/google/gson/a;

    .line 43
    .line 44
    invoke-virtual {p0}, Lwu7;->Y()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    sget-object p1, Lwu7;->y1:Lcom/google/gson/a;

    .line 49
    .line 50
    iget-object p1, p0, Lwu7;->v1:Ly5;

    .line 51
    .line 52
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Lpu7;

    .line 57
    .line 58
    new-instance v2, Ly45;

    .line 59
    .line 60
    invoke-direct {v2, p0}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lzw8;->a(Lxw8;)Ltu0;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance v3, Lt17;

    .line 68
    .line 69
    const/16 v4, 0xc

    .line 70
    .line 71
    invoke-direct {v3, p1, v2, v1, v4}, Lt17;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v1, v3, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
