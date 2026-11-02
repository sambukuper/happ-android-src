.class public final Lxc6;
.super Lf1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lv61;


# instance fields
.field public final synthetic Y:Lp01;

.field public final synthetic Z:Lyc6;


# direct methods
.method public constructor <init>(Lp01;Lyc6;)V
    .locals 1

    .line 1
    sget-object v0, Loy1;->p0:Loy1;

    .line 2
    .line 3
    iput-object p1, p0, Lxc6;->Y:Lp01;

    .line 4
    .line 5
    iput-object p2, p0, Lxc6;->Z:Lyc6;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lf1;-><init>(Lr61;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final J(Ls61;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Lp5;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    iget-object v2, p0, Lxc6;->Y:Lp01;

    .line 6
    .line 7
    iget-object p0, p0, Lxc6;->Z:Lyc6;

    .line 8
    .line 9
    invoke-direct {v0, v2, p0, v1}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Los4;->U(Ljava/lang/Throwable;Ldn2;)Z

    .line 13
    .line 14
    .line 15
    sget-object v0, Loy1;->p0:Loy1;

    .line 16
    .line 17
    iget-object p0, p0, Lyc6;->X:Ls61;

    .line 18
    .line 19
    invoke-interface {p0, v0}, Ls61;->H0(Lr61;)Lq61;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lv61;

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-interface {p0, p1, p2}, Lv61;->J(Ls61;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    throw p2
.end method
