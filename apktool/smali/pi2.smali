.class public final Lpi2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lxy1;

.field public b:Z

.field public final c:Lre1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lxy1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lpi2;->b:Z

    .line 6
    .line 7
    new-instance v0, Lre1;

    .line 8
    .line 9
    invoke-direct {v0}, Lre1;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lpi2;->c:Lre1;

    .line 13
    .line 14
    iput-object p1, p0, Lpi2;->a:Lxy1;

    .line 15
    .line 16
    return-void
.end method
