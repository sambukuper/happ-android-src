.class public final Ld14;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Le14;


# direct methods
.method public synthetic constructor <init>(Le14;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ld14;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ld14;->Y:Le14;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Ld14;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ld14;->Y:Le14;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p0, v0}, Lch3;->p(Lb14;Z)Lwd0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    iget-object v1, p0, Ld14;->Y:Le14;

    .line 15
    .line 16
    invoke-virtual {v1}, Lb14;->U()Ll14;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, Ll14;->g0:Lkz3;

    .line 21
    .line 22
    iget-object v2, p0, Lkz3;->i:Lqz3;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    new-instance v0, Lz04;

    .line 27
    .line 28
    invoke-virtual {v1}, Lb14;->U()Ll14;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ll14;->l()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v1}, Lb14;->U()Ll14;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget-object p0, p0, Ll14;->l0:Lg44;

    .line 45
    .line 46
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    move-object v5, p0

    .line 51
    check-cast v5, Lli8;

    .line 52
    .line 53
    sget-object v4, Lfw3;->f0:Lfw3;

    .line 54
    .line 55
    invoke-direct/range {v0 .. v5}, Lz04;-><init>(Lm04;Lqz3;ILfw3;Lli8;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance v0, Lrf1;

    .line 60
    .line 61
    invoke-virtual {v1}, Lb14;->U()Ll14;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {v0, p0}, Lrf1;-><init>(Lpb6;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    return-object v0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
