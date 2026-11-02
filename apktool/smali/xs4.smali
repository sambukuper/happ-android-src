.class public final Lxs4;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lys4;

.field public final Z:Lwb4;

.field public final f0:Ld2;

.field public final g0:I

.field public final h0:I

.field public final i0:Lvz5;


# direct methods
.method public synthetic constructor <init>(Lys4;Lwb4;Ld2;IILvz5;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lxs4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lxs4;->Y:Lys4;

    .line 4
    .line 5
    iput-object p2, p0, Lxs4;->Z:Lwb4;

    .line 6
    .line 7
    iput-object p3, p0, Lxs4;->f0:Ld2;

    .line 8
    .line 9
    iput p4, p0, Lxs4;->g0:I

    .line 10
    .line 11
    iput p5, p0, Lxs4;->h0:I

    .line 12
    .line 13
    iput-object p6, p0, Lxs4;->i0:Lvz5;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lxs4;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lxs4;->Y:Lys4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lys4;->a:Ljl1;

    .line 9
    .line 10
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lhl1;

    .line 13
    .line 14
    iget-object v1, v0, Lhl1;->e:Lvl;

    .line 15
    .line 16
    iget-object v2, p0, Lxs4;->Z:Lwb4;

    .line 17
    .line 18
    iget-object v3, p0, Lxs4;->f0:Ld2;

    .line 19
    .line 20
    iget v4, p0, Lxs4;->g0:I

    .line 21
    .line 22
    iget v5, p0, Lxs4;->h0:I

    .line 23
    .line 24
    iget-object v6, p0, Lxs4;->i0:Lvz5;

    .line 25
    .line 26
    invoke-interface/range {v1 .. v6}, Ljm;->g(Lwb4;Ld2;IILvz5;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    iget-object v0, v1, Lys4;->a:Ljl1;

    .line 36
    .line 37
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lhl1;

    .line 40
    .line 41
    iget-object v1, v0, Lhl1;->e:Lvl;

    .line 42
    .line 43
    iget-object v2, p0, Lxs4;->Z:Lwb4;

    .line 44
    .line 45
    iget-object v3, p0, Lxs4;->f0:Ld2;

    .line 46
    .line 47
    iget v4, p0, Lxs4;->g0:I

    .line 48
    .line 49
    iget v5, p0, Lxs4;->h0:I

    .line 50
    .line 51
    iget-object v6, p0, Lxs4;->i0:Lvz5;

    .line 52
    .line 53
    invoke-interface/range {v1 .. v6}, Ljm;->k(Lwb4;Ld2;IILvz5;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
