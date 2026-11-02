.class public final Lil1;
.super Lwp4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final n0:I


# instance fields
.field public final m0:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lkl1;

    .line 2
    .line 3
    invoke-static {v0}, Lvp4;->b(Ljava/lang/Class;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Lil1;->n0:I

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lil1;JI)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lwp4;-><init>(Lwp4;J)V

    .line 11
    iput p4, p0, Lil1;->m0:I

    return-void
.end method

.method public constructor <init>(Ll20;Lmj7;Lu97;Lc24;Lmd0;Lov0;Lpb1;)V
    .locals 0

    .line 1
    move-object p6, p7

    .line 2
    invoke-direct/range {p0 .. p6}, Lwp4;-><init>(Ll20;Lmj7;Lu97;Lc24;Lmd0;Lpb1;)V

    .line 3
    .line 4
    .line 5
    sget p1, Lil1;->n0:I

    .line 6
    .line 7
    iput p1, p0, Lil1;->m0:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e(Lnb1;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lwp4;->j0:Lpb1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lnb1;->b()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget p0, p0, Lpb1;->Y:I

    .line 16
    .line 17
    invoke-interface {p1, p0}, Lij3;->a(I)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    sget p0, Lev8;->a:I

    .line 23
    .line 24
    const-string p0, "Internal error: this code path should never get executed"

    .line 25
    .line 26
    invoke-static {p0}, Lkp5;->t(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_1
    iget p0, p0, Lpb1;->X:I

    .line 32
    .line 33
    invoke-interface {p1, p0}, Lij3;->a(I)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public final g(J)Lwp4;
    .locals 2

    .line 1
    new-instance v0, Lil1;

    .line 2
    .line 3
    iget v1, p0, Lil1;->m0:I

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, v1}, Lil1;-><init>(Lil1;JI)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
