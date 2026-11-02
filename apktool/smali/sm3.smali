.class public abstract Lsm3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lz31;

.field public static final b:Lz31;

.field public static final c:Lz31;

.field public static final d:Lz31;

.field public static final e:Lz31;

.field public static final f:Ltz1;

.field public static final g:Ltz1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lz31;

    .line 2
    .line 3
    const-string v1, "COMPLETING_ALREADY"

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v0, v1, v2}, Lz31;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lsm3;->a:Lz31;

    .line 10
    .line 11
    new-instance v0, Lz31;

    .line 12
    .line 13
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lz31;-><init>(Ljava/lang/String;B)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lsm3;->b:Lz31;

    .line 19
    .line 20
    new-instance v0, Lz31;

    .line 21
    .line 22
    const-string v1, "COMPLETING_RETRY"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lz31;-><init>(Ljava/lang/String;B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lsm3;->c:Lz31;

    .line 28
    .line 29
    new-instance v0, Lz31;

    .line 30
    .line 31
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lz31;-><init>(Ljava/lang/String;B)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lsm3;->d:Lz31;

    .line 37
    .line 38
    new-instance v0, Lz31;

    .line 39
    .line 40
    const-string v1, "SEALED"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Lz31;-><init>(Ljava/lang/String;B)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lsm3;->e:Lz31;

    .line 46
    .line 47
    new-instance v0, Ltz1;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, v1}, Ltz1;-><init>(Z)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lsm3;->f:Ltz1;

    .line 54
    .line 55
    new-instance v0, Ltz1;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-direct {v0, v1}, Ltz1;-><init>(Z)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lsm3;->g:Ltz1;

    .line 62
    .line 63
    return-void
.end method

.method public static final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lfb3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lfb3;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, v0, Lfb3;->a:Lbb3;

    .line 13
    .line 14
    :cond_1
    return-object p0
.end method
