.class public abstract Lwp4;
.super Lvp4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final k0:J

.field public static final l0:J


# instance fields
.field public final Z:Lu97;

.field public final f0:Lmj7;

.field public final g0:Lw39;

.field public final h0:Lc24;

.field public final i0:Lmd0;

.field public final j0:Lpb1;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    invoke-static {}, Lxp4;->values()[Lxp4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    :goto_0
    if-ge v4, v1, :cond_1

    .line 10
    .line 11
    aget-object v5, v0, v4

    .line 12
    .line 13
    iget-boolean v6, v5, Lxp4;->X:Z

    .line 14
    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    iget-wide v5, v5, Lxp4;->Y:J

    .line 18
    .line 19
    or-long/2addr v2, v5

    .line 20
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sput-wide v2, Lwp4;->k0:J

    .line 24
    .line 25
    sget-object v0, Lxp4;->h0:Lxp4;

    .line 26
    .line 27
    iget-wide v0, v0, Lxp4;->Y:J

    .line 28
    .line 29
    sget-object v2, Lxp4;->i0:Lxp4;

    .line 30
    .line 31
    iget-wide v2, v2, Lxp4;->Y:J

    .line 32
    .line 33
    or-long/2addr v0, v2

    .line 34
    sget-object v2, Lxp4;->j0:Lxp4;

    .line 35
    .line 36
    iget-wide v2, v2, Lxp4;->Y:J

    .line 37
    .line 38
    or-long/2addr v0, v2

    .line 39
    sget-object v2, Lxp4;->k0:Lxp4;

    .line 40
    .line 41
    iget-wide v2, v2, Lxp4;->Y:J

    .line 42
    .line 43
    or-long/2addr v0, v2

    .line 44
    sget-object v2, Lxp4;->g0:Lxp4;

    .line 45
    .line 46
    iget-wide v2, v2, Lxp4;->Y:J

    .line 47
    .line 48
    or-long/2addr v0, v2

    .line 49
    sput-wide v0, Lwp4;->l0:J

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>(Ll20;Lmj7;Lu97;Lc24;Lmd0;Lpb1;)V
    .locals 2

    .line 29
    sget-wide v0, Lwp4;->k0:J

    invoke-direct {p0, p1, v0, v1}, Lvp4;-><init>(Ll20;J)V

    .line 30
    iput-object p3, p0, Lwp4;->Z:Lu97;

    .line 31
    iput-object p2, p0, Lwp4;->f0:Lmj7;

    .line 32
    iput-object p4, p0, Lwp4;->h0:Lc24;

    .line 33
    sget-object p1, Le51;->j0:Le51;

    .line 34
    iput-object p1, p0, Lwp4;->g0:Lw39;

    .line 35
    iput-object p5, p0, Lwp4;->i0:Lmd0;

    .line 36
    iput-object p6, p0, Lwp4;->j0:Lpb1;

    return-void
.end method

.method public constructor <init>(Lwp4;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lvp4;-><init>(Lwp4;J)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p1, Lwp4;->Z:Lu97;

    .line 5
    .line 6
    iput-object p2, p0, Lwp4;->Z:Lu97;

    .line 7
    .line 8
    iget-object p2, p1, Lwp4;->f0:Lmj7;

    .line 9
    .line 10
    iput-object p2, p0, Lwp4;->f0:Lmj7;

    .line 11
    .line 12
    iget-object p2, p1, Lwp4;->h0:Lc24;

    .line 13
    .line 14
    iput-object p2, p0, Lwp4;->h0:Lc24;

    .line 15
    .line 16
    iget-object p2, p1, Lwp4;->g0:Lw39;

    .line 17
    .line 18
    iput-object p2, p0, Lwp4;->g0:Lw39;

    .line 19
    .line 20
    iget-object p2, p1, Lwp4;->i0:Lmd0;

    .line 21
    .line 22
    iput-object p2, p0, Lwp4;->i0:Lmd0;

    .line 23
    .line 24
    iget-object p1, p1, Lwp4;->j0:Lpb1;

    .line 25
    .line 26
    iput-object p1, p0, Lwp4;->j0:Lpb1;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lwp4;->Z:Lu97;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu97;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
