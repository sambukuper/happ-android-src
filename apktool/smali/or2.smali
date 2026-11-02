.class public final Lor2;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lye8;


# static fields
.field public static final r0:Lk42;


# instance fields
.field public final q0:Lnr2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk42;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lor2;->r0:Lk42;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lnr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lor2;->q0:Lnr2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final o()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lor2;->r0:Lk42;

    .line 2
    .line 3
    return-object p0
.end method
