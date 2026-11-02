.class public final Lek6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final d:Lek6;

.field public static final e:Lek6;

.field public static final f:Lek6;


# instance fields
.field public final a:S

.field public final b:Z

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lek6;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v3, v3}, Lek6;-><init>(JZZ)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lek6;->d:Lek6;

    .line 10
    .line 11
    new-instance v0, Lek6;

    .line 12
    .line 13
    const-wide/16 v4, 0x1f4

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    invoke-direct {v0, v4, v5, v6, v3}, Lek6;-><init>(JZZ)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lek6;->e:Lek6;

    .line 20
    .line 21
    new-instance v0, Lek6;

    .line 22
    .line 23
    const-wide/16 v4, 0x64

    .line 24
    .line 25
    invoke-direct {v0, v4, v5, v6, v3}, Lek6;-><init>(JZZ)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lek6;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v3, v6}, Lek6;-><init>(JZZ)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lek6;->f:Lek6;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(JZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lek6;->b:Z

    .line 5
    .line 6
    long-to-int p1, p1

    .line 7
    iput-short p1, p0, Lek6;->a:S

    .line 8
    .line 9
    if-eqz p4, :cond_0

    .line 10
    .line 11
    xor-int/lit8 p1, p3, 0x1

    .line 12
    .line 13
    const-string p2, "shouldRetry must be false when completeWithoutFailure is set to true"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lmb6;->o(ZLjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iput-boolean p4, p0, Lek6;->c:Z

    .line 19
    .line 20
    return-void
.end method
