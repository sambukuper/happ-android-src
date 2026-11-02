.class public final Lbr0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final b:Lbr0;

.field public static final c:Lbr0;


# instance fields
.field public final a:Z


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbr0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lbr0;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lbr0;->b:Lbr0;

    .line 8
    .line 9
    new-instance v0, Lbr0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lbr0;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lbr0;->c:Lbr0;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lbr0;->a:Z

    .line 5
    .line 6
    return-void
.end method
