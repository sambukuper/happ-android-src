.class public final Lc06;
.super Lwb4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final e:Lfy5;

.field public final f:Lc06;

.field public final g:Lqs0;

.field public final h:Ley5;

.field public final i:Z


# direct methods
.method public constructor <init>(Lfy5;Lw15;Lux4;Lke7;Lc06;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, p2, p3, p4, v0}, Lwb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lc06;->e:Lfy5;

    .line 12
    .line 13
    iput-object p5, p0, Lc06;->f:Lc06;

    .line 14
    .line 15
    iget p3, p1, Lfy5;->g0:I

    .line 16
    .line 17
    invoke-static {p2, p3}, Lu70;->L(Lw15;I)Lqs0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iput-object p2, p0, Lc06;->g:Lqs0;

    .line 22
    .line 23
    sget-object p2, Lmd2;->f:Lkd2;

    .line 24
    .line 25
    iget p3, p1, Lfy5;->f0:I

    .line 26
    .line 27
    invoke-virtual {p2, p3}, Lkd2;->e(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Ley5;

    .line 32
    .line 33
    if-nez p2, :cond_0

    .line 34
    .line 35
    sget-object p2, Ley5;->Y:Ley5;

    .line 36
    .line 37
    :cond_0
    iput-object p2, p0, Lc06;->h:Ley5;

    .line 38
    .line 39
    sget-object p2, Lmd2;->g:Ljd2;

    .line 40
    .line 41
    iget p1, p1, Lfy5;->f0:I

    .line 42
    .line 43
    invoke-virtual {p2, p1}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput-boolean p1, p0, Lc06;->i:Z

    .line 52
    .line 53
    sget-object p0, Lmd2;->h:Ljd2;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final c()Lfk2;
    .locals 0

    .line 1
    iget-object p0, p0, Lc06;->g:Lqs0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqs0;->a()Lfk2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
