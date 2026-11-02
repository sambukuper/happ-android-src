.class public final Laf0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lze2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lef0;


# direct methods
.method public synthetic constructor <init>(Lef0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Laf0;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Laf0;->Y:Lef0;

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
    .locals 4

    .line 1
    iget-byte p2, p0, Laf0;->X:B

    .line 2
    .line 3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object p0, p0, Laf0;->Y:Lef0;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ldn8;

    .line 11
    .line 12
    sget-object p1, Lal0;->a:Lal0;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lef0;->d(Ldl0;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    check-cast p1, Ldl0;

    .line 19
    .line 20
    iget-object p2, p0, Lef0;->d:Lhi0;

    .line 21
    .line 22
    instance-of v1, p1, Lzk0;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const-string v3, "Check failed."

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move-object v1, p1

    .line 30
    check-cast v1, Lzk0;

    .line 31
    .line 32
    iget-object v1, v1, Lzk0;->a:Ljava/lang/String;

    .line 33
    .line 34
    iget-object p2, p2, Lhi0;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lef0;->d(Ldl0;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    move-object v0, v2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    instance-of v1, p1, Lbl0;

    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    move-object v1, p1

    .line 56
    check-cast v1, Lbl0;

    .line 57
    .line 58
    iget-object v1, v1, Lbl0;->a:Ljava/lang/String;

    .line 59
    .line 60
    iget-object p2, p2, Lhi0;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lef0;->d(Ldl0;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    :goto_1
    return-object v0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
