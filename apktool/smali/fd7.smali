.class public final Lfd7;
.super Lys0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final w0:Lx05;


# direct methods
.method public constructor <init>(Lx05;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfd7;->w0:Lx05;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final l()V
    .locals 0

    .line 1
    iget-object p0, p0, Lfd7;->w0:Lx05;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx05;->c()V

    .line 4
    .line 5
    .line 6
    new-instance p0, Led7;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method
