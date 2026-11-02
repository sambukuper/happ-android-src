.class public final Lwd3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lkh;

.field public final b:Lo7;

.field public final c:Ljava/lang/Object;

.field public final d:Lc15;

.field public e:Z


# direct methods
.method public constructor <init>(Lkh;Lo7;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwd3;->a:Lkh;

    .line 5
    .line 6
    iput-object p2, p0, Lwd3;->b:Lo7;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lwd3;->c:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p1, Lc15;

    .line 16
    .line 17
    const/16 p2, 0x10

    .line 18
    .line 19
    new-array p2, p2, [Lb09;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p1, v0, p2}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lwd3;->d:Lc15;

    .line 26
    .line 27
    return-void
.end method
