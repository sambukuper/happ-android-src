.class public final Lhb8;
.super Lbu0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public O0:Z

.field public P0:Lgn2;

.field public final Q0:Lv38;


# direct methods
.method public constructor <init>(ZLxz4;ZLkl6;Lgn2;)V
    .locals 8

    .line 1
    new-instance v7, Lda3;

    .line 2
    .line 3
    invoke-direct {v7, p5, p1}, Lda3;-><init>(Lgn2;Z)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    move-object v0, p0

    .line 10
    move-object v1, p2

    .line 11
    move v4, p3

    .line 12
    move-object v6, p4

    .line 13
    invoke-direct/range {v0 .. v7}, Lx0;-><init>(Lxz4;Ltb3;ZZLjava/lang/String;Lkl6;Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-boolean p1, v0, Lhb8;->O0:Z

    .line 17
    .line 18
    iput-object p5, v0, Lhb8;->P0:Lgn2;

    .line 19
    .line 20
    new-instance p0, Lv38;

    .line 21
    .line 22
    const/4 p1, 0x7

    .line 23
    invoke-direct {p0, v0, p1}, Lv38;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    iput-object p0, v0, Lhb8;->Q0:Lv38;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final b1(Lf17;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lhb8;->O0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lib8;->X:Lib8;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lib8;->Y:Lib8;

    .line 9
    .line 10
    :goto_0
    sget-object v1, Ld17;->a:[Lnw3;

    .line 11
    .line 12
    sget-object v1, Lc17;->L:Le17;

    .line 13
    .line 14
    sget-object v2, Ld17;->a:[Lnw3;

    .line 15
    .line 16
    const/16 v3, 0x1a

    .line 17
    .line 18
    aget-object v3, v2, v3

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v1, v0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Loy1;->o0:Lwc;

    .line 27
    .line 28
    sget-object v1, Lc17;->s:Le17;

    .line 29
    .line 30
    const/16 v3, 0x9

    .line 31
    .line 32
    aget-object v3, v2, v3

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v1, v0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-boolean p0, p0, Lhb8;->O0:Z

    .line 41
    .line 42
    invoke-static {p0}, Lue3;->l(Z)Lyd;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    sget-object v0, Lc17;->t:Le17;

    .line 49
    .line 50
    const/16 v1, 0xa

    .line 51
    .line 52
    aget-object v1, v2, v1

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v0, p0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    new-instance p0, Lmr0;

    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    invoke-direct {p0, p1, v0}, Lmr0;-><init>(Lf17;B)V

    .line 64
    .line 65
    .line 66
    sget-object v0, Ls07;->h:Le17;

    .line 67
    .line 68
    new-instance v1, Lq3;

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-direct {v1, v2, p0}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1, v0, v1}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
